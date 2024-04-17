
# wc-tool

Our own version of the Unix command line tool wc.


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
```

