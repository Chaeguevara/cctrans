CCTransformationExtraction is a program to extract concept transformations from geo-analytical questions. 

## Installation
### Requirements
The program is implemented in python (version 3.7). Several libraries should be installed (use pip command to install the following libraries) before running the code:
```
pip install numpy
pip install allennlp
pip install -U spacy
pip install nltk
pip install word2number
```
To run `nltk.pos_tag()` dataset need to be downloaded otherwise run with out error message so that makes it demanding to debug
[nltk model download](https://www.nltk.org/data.html)
```bash
sudo python -m nltk.downloader -d /usr/local/share/nltk_data all
```

Install `conda env` with [`yml file`](env.yml)


## Usage
Run the script `Identify.py` on `GeoAnQu.txt` to get training results `Results_train_Auto.json`.
Check the `Grammar` folder for more details of the functional grammar in `GeoAnQu.g4`.
Check the `Dictionary` folder for the concept dictionary.

To check the evaluation, navigate to `CCTrans_evaluation` folder in the project folder, and use `evalTest.py` to generate `EvaluationResults.csv`.
`Results_test_Auto.json` is generated by running `Identify.py` on `test corpus.txt`.
`Results_test_Manual.json` is manually generated as the gold standard used in evaluation.

## Run sequence
1. run [GeoAnQu.g4](./CCTransformationExtraction/Grammar/GeoAnQu.g4) with command `antlr4 -Dlanguage=Python3 MyGrammar.g4` (from [antrl4 repo](https://github.com/antlr/antlr4/blob/master/doc/python-target.md))
1. Specify the file path described above in [Identify.py](./CCTransformationExtraction/Identify.py)
    1. The parameter name is `questionFilePath`
1. run [Identify.py](./CCTransformationExtraction/Identify.py) by `python Identify.py`

## License
[CC BY-NC-ND 4.0](https://creativecommons.org/licenses/by-nc-nd/4.0/)
