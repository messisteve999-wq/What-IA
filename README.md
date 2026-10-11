# What-IA — projet Android de démarrage

Application Android Java légère avec écran d'accueil What-IA / Steve.

## Prérequis
- Android SDK Platform 34
- Android Build Tools 34.0.0
- JDK 17 ou 21
- Gradle compatible avec Android Gradle Plugin 8.9.1 (Gradle 8.11.1 recommandé)
- Accès réseau pour télécharger les dépendances Gradle lors de la première compilation

## Compilation
Depuis la racine du projet, après installation d'un Gradle compatible :

```bash
export ANDROID_HOME="$HOME/android-sdk"
export ANDROID_SDK_ROOT="$ANDROID_HOME"
gradle assembleDebug
```

L'APK de test sera générée dans `app/build/outputs/apk/debug/app-debug.apk`.

## Important
Ce ZIP contient une première maquette fonctionnelle de l'écran d'accueil. Il ne répond pas encore automatiquement aux messages WhatsApp et n'intègre pas encore de moteur IA. L'automatisation doit être ajoutée et testée séparément, avec les autorisations Android nécessaires. L'API OpenAI/ChatGPT n'est pas gratuite par défaut.
