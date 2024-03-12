library(tidyverse)
library(ggplot2)

dataRandom = read.csv("../../../random.csv")
dataNearly = read.csv("../../../nearlySorted.csv")

ggplot(dataRandom, aes(Array.Size)) + 
  geom_line(aes(y = Selection), color = "blue") + 
  geom_line(aes(y = Insertion), color = "purple") + 
  geom_line(aes(y = Bubble), color = "green") + 
  geom_line(aes(y = Merge), color = "yellow") +
  geom_line(aes(y = Quick), color = "red")
  
