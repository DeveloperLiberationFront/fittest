mvn install:install-file -DgroupId=eu.fittest.uu -DartifactId=eu.fittest.uu.lopi -Dversion=1.0.0-SNAPSHOT -Dclassifier=macos-binaries -Dpackaging=zip -Dfile=eu.fittest.uu.lopi-1.0.0-SNAPSHOT-macos-binaries.zip

mvn install:install-file -DgroupId=eu.fittest.uu -DartifactId=eu.fittest.uu.lopi -Dversion=1.0.0-SNAPSHOT -Dclassifier=win32-binaries -Dpackaging=zip -Dfile=eu.fittest.uu.lopi-1.0.0-SNAPSHOT-win32-binaries.zip

mvn install:install-file -DgroupId=eu.fittest.uu -DartifactId=eu.fittest.uu.lopi -Dversion=1.0.0-SNAPSHOT -Dclassifier=win64-binaries -Dpackaging=zip -Dfile=eu.fittest.uu.lopi-1.0.0-SNAPSHOT-win64-binaries.zip

mvn install:install-file -DgroupId=eu.fittest.uu -DartifactId=eu.fittest.uu.lopi -Dversion=1.0.0-SNAPSHOT -Dclassifier=linux64-binaries -Dpackaging=zip -Dfile=eu.fittest.uu.lopi-1.0.0-SNAPSHOT-linux64-binaries.zip