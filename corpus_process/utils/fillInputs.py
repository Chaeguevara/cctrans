import pandas as pd


INPUT_PATH = "../data/DataCorpus.xlsx"

def split_in_corpus():
    xl = pd.read_excel(INPUT_PATH)
    question = xl["Question"]
    print(question)
    qu_split_df = question.apply(lambda x : x.split(" in "))
    qu_split_df = qu_split_df.apply(pd.Series)
    question = pd.concat([question, qu_split_df], axis=1)
    question.to_excel("../data/DataCorpus_split_in.xlsx")
    return


if __name__ == "__main__":
    print('hi')
    split_in_corpus()


