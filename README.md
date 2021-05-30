# fantastic-bassoon

This repo is a demonstration of Softmax layer implementation in KotlinDL.

## Python
The script in `./python` directory creates a simple network for MNIST classification utilising a Softmax layer, and exports it as a JSON file

Environment setup:
```
python -m venv env/
source env/bin/activate
pip install -r requirements.txt
```

Running:
```
python main.py
```

Copy the resulting `keras_model.json` from `./python` to `./kotlin` directory

## Kotlin
The project in `./kotlin` directory uses `softmax-layer` branch of `d-lowl/KotlinDL` repo, and has two functions to run

### Training
`space.dlowl.example.TrainKt` imports MNIST dataset, builds a network, and trains it.
Expected behaviour: no errors, accuracy is close to 1.

```
./gradlew runTrain
```

### Importing
`space.dlowl.example.ImportKt` imports the previously exported model (i.e. `./kotlin/keras_model.json`), compiles it, and prints the summary.
Expected behaviour: no errors, the model summary is correctly printed

```
./gradlew runImport
```