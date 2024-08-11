# DBT
> A demo Springboot project about Dragon Ball Transformations.

DBT is an example Springboot app that features a simple backend and frontend
for the sake of understanding how Springboot works and key components that 
Springboot offers.

# About
DBT offers information about Dragon Ball characters such as their power-ups, feats, transformations, and other relevant information. Since DBT is a demo project, there are only a few characters in storage.

# Building
In order to build and run Springboot, you will need to have [Postgres 16](https://www.postgresql.org/download/) installed and configured as specified in the `application.properties` file under `resources`.

To run the project, you can use the following command:
```bash
./gradlew bootRun
```

If you wish to build the project, you can use the following command:
```bash
./gradlew build
```

Following this, you will get a `.jar` file in an output folder.