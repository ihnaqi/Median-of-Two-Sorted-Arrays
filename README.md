## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

## Project Description

The project contains the solution to the problem provided in [here](shorturl.at/fxI18).
Here we are given two sorted arrays of length `m` and `n` respectively, we need to return the `median` of the sorted arrays. But the constraints is that our provided solution's complexity must not exceed `O(log(m + n))`. The provided arrays are of numbers.

`Constraints`
0 <= m <= 1000
0 <= n <= 1000
0 <= m + n <= 1000
-10^6 <= array[1]
array[i] <= 10^6

> (An example)
> [Input]
> int arr1 [] = {1, 3, 7, 8};
> int arr2 [] = {2, 4, 6};

> int result_array [] = {1, 2, 3, 6, 7, 8};
> [Output] = 4.5
