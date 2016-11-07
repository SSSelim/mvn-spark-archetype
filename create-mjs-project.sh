#!/usr/bin/env bash

if [ "$1" = "" ]; then
  echo "use it with a project name."
  exit
fi

mvn archetype:generate -X \
  -DarchetypeGroupId=com.selimssevgi \
  -DarchetypeArtifactId=ssselim-spark-archetype \
  -DarchetypeVersion=1.0-SNAPSHOT \
  -DgroupId=com.selimssevgi \
  -DartifactId=$project_name \
  -Dversion=1.0-SNAPSHOT \
  -Dpackage=com.selimssevgi \
  -DinteractiveMode=false
