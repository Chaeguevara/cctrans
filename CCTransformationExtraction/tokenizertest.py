import nltk

text = nltk.word_tokenize("Which houses are for sale in Utrecht")
print(nltk.pos_tag((text)))
