#!/bin/sh

files=`find . -name *.java`
for f in ${files[@]}
do
  echo "Processing $f file.."
  clang-format -i $f
done
