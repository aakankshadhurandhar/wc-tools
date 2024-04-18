
# Word Count in Java
This utility is a Java implementation of the Unix wc command. It provides statistics about a file or input from the standard input (System.in). The statistics include the number of bytes, lines, words, and characters.


## Usage
The utility can be run from the command line with various flags to specify what statistics to output. If no flags are provided, it defaults to counting bytes, lines, and words.

Here are the available flags:

--c: Count the number of bytes in the input.
--l: Count the number of lines in the input.
--w: Count the number of words in the input.
--m: Count the number of characters in the input.

You can specify one or more flags. For example, to count the number of lines and words in a file, you would use the --l and --w flags:

```bash
 ccwc --l --w myfile.txt
```
Standard Input
If no file is specified, the utility reads from stdin. For example, you can pipe the output of another command into this utility:

```bash
cat text.txt | ccwc --l
```
## Run Locally

Clone the project

```bash
  git clone https://github.com/aakankshadhurandhar/wc-tools
```

Go to the project directory

```bash
  cd wc-tools
```

Install dependencies

```bash
  mvn clean package
  source .bash_profile
```

Run CLI tool

```bash
  ccwc --c file_name #count no of bytes of file
  ccwc --l file_name #count no of lines in file
  ccwc --w file_name #count no of words in file
  ccwc file_name #default options
  cat file_name | ccwc --l #Standard input
```

## Inspiration

[Coding challenge-wc](https://codingchallenges.fyi/challenges/challenge-wc/)