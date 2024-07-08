# Mtgbase

Full stack [Magic the Gathering card game](https://magic.wizards.com/en) database, made with:

- Angular, TypeScript
- Spring Boot, Java

## Install and run

### Inside Docker

To run the complete projects, [you will need Docker Desktop running.](https://www.docker.com/products/docker-desktop/)

1. Open a Terminal
1. Go to the source folder
1. Execute the command: `docker compose up`
1. Open the browser at http://localhost:3050

**Please note: you need to wait until the build is ready! This might take more than 40 seconds for all the containers.**

(I tested the build on Windows 11 with the following desktop computer: Intel Core i7-10700, 16 GB DDR4 SDRAM.)

```
client-1  | - Generating browser application bundles (phase: setup)...
client-1  | ✔ Browser application bundle generation complete.
client-1  |
client-1  | Initial Chunk Files   | Names         |  Raw Size
client-1  | vendor.js             | vendor        |   2.13 MB |
client-1  | polyfills.js          | polyfills     | 314.84 kB |
client-1  | styles.css, styles.js | styles        | 210.99 kB |
client-1  | main.js               | main          |  59.51 kB |
client-1  | runtime.js            | runtime       |   6.53 kB |
client-1  |
client-1  | | Initial Total |   2.71 MB
client-1  |
client-1  | Build at: 2024-04-16T18:56:01.755Z - Hash: d65c309ccd4dcf9a - Time: 32302ms
client-1  |
client-1  | ** Angular Live Development Server is listening on 0.0.0.0:3000, open your browser on http://localhost:3000/ **
client-1  |
client-1  |
client-1  | ✔ Compiled successfully.
```

If you need container rebuilding, use `docker compose up --build`

### Locally or in separate containers

Please see how to use the frontend and backend in the subfolder docs.

- [Frontend docs](frontend/README.md)
- [Backend docs](backend/README.md)

## Screenshot

The cover page looks like this.

![Cover page](screenshot.png)

## License

Card pictures are subject to the unofficial Fan Content policy.

```
Portions of Mtgbase are unofficial Fan Content permitted
under the Wizards of the Coast Fan Content Policy.
The literal and graphical information presented on this site about
Magic: The Gathering, including card images and mana symbols,
is copyright Wizards of the Coast, LLC. Mtgbase is not produced by
or endorsed by Wizards of the Coast.
```

## History

- The angular frontend was updated to 18 on July 2024.
- I started the project in September 2023.

Everything else [is licensed as such.](LICENSE)
