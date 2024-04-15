# Lab 2 - Spring Boot App with CI/CD


[![CI/CD Pipeline](https://github.com/JoseGomez14/lab2-arq-soft/actions/workflows/build.yaml/badge.svg?branch=deploy)](https://github.com/JoseGomez14/lab2-arq-soft/actions/workflows/build.yaml) [![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=JoseGomez14_lab2-arq-soft&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=JoseGomez14_lab2-arq-soft) [![Coverage](https://sonarcloud.io/api/project_badges/measure?project=JoseGomez14_lab2-arq-soft&metric=coverage)](https://sonarcloud.io/summary/new_code?id=JoseGomez14_lab2-arq-soft) ![Synk Security](https://snyk.io/test/github/JoseGomez14/lab2-arq-soft/badge.svg)

![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white) ![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white) ![Maven](https://img.shields.io/badge/maven-%23C71A36.svg?style=for-the-badge&logo=apache-maven&logoColor=white) ![GitHub Actions](https://img.shields.io/badge/GitHub_Actions-2088FF?style=for-the-badge&logo=github-actions&logoColor=white) ![SonarCloud](https://img.shields.io/badge/Sonar%20cloud-F3702A?style=for-the-badge&logo=sonarcloud&logoColor=white)![Snyk](https://img.shields.io/badge/snyk-%23F291.svg?style=for-the-badge&logo=snyk&logoColor=white)![AWS](https://img.shields.io/badge/Amazon_AWS-FF9900?style=for-the-badge&logo=amazonaws&logoColor=wh)

### Developers

- [Daniel Lujan Agudelo](https://github.com/daniel-lujan)
- [Jose David Gómez Muñetón](https://github.com/JoseGomez14)
- [Juan Pablo Arango Gaviria](https://github.com/JuanPablo-A)
- [Maritza Tabares Cárdenas](https://github.com/MaritzaTC)
- [Luis Guillermo Sánchez Cubides](https://github.com/GuillermoSanchez11)
- [Ana María Vega Angarita](https://github.com/anavegaa)

## Description

Implementation of a Simple App with the next operations:

- Random nations
  - `GET /nations`

    Returns a random list of nations
    

- Random currencies
  - `GET /currencies`

    Returns a random list of currencies.

- Random aviation
  - `GET /airlines`

    Returns a random list of airlines.

- Application version
  - `GET /version`

    Returns the current version of the application.

- Health check
  - `GET /health`

    Returns the status of the application.

Including integration with GitHub Actions, Sonarqube (SonarCloud), Coveralls and Snyk

### Folders Structure

In the folder `src` is located the main code of the app

In the folder `test` is located the unit tests

### How to install it

Execute:

```shell
$ mvnw spring-boot:run
```

to download the node dependencies

### How to test it

Execute:

```shell
$ mvnw clean install
```

### How to get coverage test

Execute:

```shell
$ mvwn -B package -DskipTests --file pom.xml
```