# Generate the base-archetype
After creating a base project(like this one) and placing every file for a fresh start,
cd into that project directory.

## Step 1 
If there is already a target directory, remove it.

## Step 2
In project root directory.

```bash
mvn archetype:create-from-project
```

## Step 3 
Check if everything looks fine.

```bash
cd target/generated-sources/archetype
tree -d
```

## Step 4
Adjust pom.xml in target/generated-sources/archetype if necessary.

## Step 5
Adjust src/main/resources/META-INF/maven/archetype-metadata.xml, like removing
files related to IDE in filesets.

## Step 6
When you are done with changing, in archetype directory run:

```bash
mvn install
```

## Finally
The archetype is now available locally. Either can follow the steps of:

```bash
mvn archetype:generate
```

or using create-mjs-project.sh script.

### Issues
It doesnt include .gitignore, that must be done manually for now.

### Resources 

Maven Official Guide :
https://maven.apache.org/guides/introduction/introduction-to-archetypes.html

An java-spark example : https://github.com/jjmeyer0/spark-java-archetype

Archetypes from existing project :
https://www.youtube.com/watch?v=a_nTvBA787g

http://geekofficedog.blogspot.com.tr/2013/08/creating-maven-archetypes-tutorial.html
