# NoPush

Fabric client mod for Minecraft 1.21.4. Stops the client from pushing you out of blocks. Toggle with N (rebindable in Controls).

Requires Java 21 and Fabric API.

## Build on GitHub

1. Push this project to a GitHub repository.
2. Open the **Actions** tab and wait for the **Build** workflow to finish (or run it with "Run workflow").
3. Open the finished run and download the **nopush-jar** artifact. Unzip it and use the jar that does not end in `-sources`.
4. Put the jar in your `.minecraft/mods` folder together with Fabric API.

## Build locally

```
gradle build
```

The jar appears in `build/libs/`.
