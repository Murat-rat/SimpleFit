# SimpleFit

> **Proyecto Integrador - Desarrollo de Aplicaciones Móviles**
>
> **Semestre:** 4°E
> **Fecha de entrega:** 11 de Diciembre

---

## Equipo de Desarrollo

| Nombre Completo | Rol / Tareas Principales | Usuario GitHub |
| :--- | :--- | :--- |
| Murat Castro Álvarez | Diseño de la UI, Creación del Repo, Login y registro | [@Murat-rat](https://github.com/Murat-rat) |
| Leonardo Díaz Espinosa | Pantalla principal, Pantalla de sesión en curso, Cards | [@LeonardoDiazz](https://github.com/LeonardoDiazz) |
| Shanny Odeth Ramos Santiesteban | Configuración del sensor, Retrofit, Base de Datos, Pruebas | [@ShannyRamos17](https://github.com/ShannyRamos17) |

---

## Descripción del Proyecto

**¿Qué hace la aplicación?**
La aplicación es un podómetro simple que permite registrase e iniciar sesión para poder registrar nuestras sesiones de actividad física al caminar o correr.

La aplicación utiliza el acelerometro de los dispositivo para registrar los pasos del usuario y de esa manera calcular la distancia que recorre un usario.

En la pantalla principal la aplicación muestra tarjetas en las que se puede ver la información de los registros de actividad física, muestra los siguientes datos:
- Nombre de usuario
- Duración acomulada de la sesión
- Distancia aproximada recorrida
- Velocidad promedio 
- Fecha en la cual se actualizó por última vez la sesión

Se puede dar click a las tarjetas para reanudar una sesión, manteniendo los datos que ya tenía almacenada la sesión y añadiendo a ellos. Cada tarjeta también
tiene un botón que permite eliminar el registro de la base de datos.

La aplicación utiliza los servicios de la página mockapi.io para simular la api permitir que los servicios de la app estén disponibles todo el tiempo.

**Objetivo:**
La aplicación busca ser una solución simple para personas que disfrutan salir a caminar o correr de manera casual, pero que a la vez les gustaría tener un
registro de su actividad.

---

## Stack Tecnológico y Características

Este proyecto ha sido desarrollado siguiendo estrictamente los lineamientos de la materia:

* **Lenguaje:** Kotlin 100%.
* **Interfaz de Usuario:** Jetpack Compose.
* **Arquitectura:** MVVM (Model-View-ViewModel).
* **Conectividad (API REST):** Retrofit.
    * **GET:** Obtiene y le muestra al usuario tarjetas con los detalles de su actividad física.
    * **POST:** Crea un objeto RunItem que registra el usuario, tiempo, distancia, velocidad y fecha del registro.
    * **UPDATE:** Obtiene los datos de un registro y luego reanuda la sesión para modificar los datos mencinados anteriormente.
    * **DELETE:** Elimina los datos de una sesión de actividad del usuario.
* **Sensor Integrado:** La aplicación hace uso del acelerometro.
    * *Uso:* El acelerometro se usa para detectar los pasos del usuario y añadir a la ditancia por cada paso que registre el sisitema. Para esto
    * realiza una resta entre cada velocidad que registra el acelerometro y la diferencia es mayor a cierto número registra un paso.

---

## Capturas de Pantalla

[Coloca al menos 3 (investiga como agregarlas y se vean en GitHub)]

| Pantalla de Login |
| :---: | :---: | :---: |
| ![Inicio](https://github.com/Murat-rat/SimpleFit/blob/916029e0a31c23efe0491b79f9a9f7b618c6f306/Inicio_Sesion.jpg)   |
| Pantalla de Inicio |
|![Sensor](https://github.com/Murat-rat/SimpleFit/blob/916029e0a31c23efe0491b79f9a9f7b618c6f306/Pagina_Principal.jpg) | 
| Registro de Actividad |
|![CRUD](https://github.com/Murat-rat/SimpleFit/blob/916029e0a31c23efe0491b79f9a9f7b618c6f306/Recorridos.jpg)         |



---

## Instalación y Releases

El ejecutable firmado (.apk) se encuentra disponible en la sección de **Releases** de este repositorio.

1.  Ve a la sección "Releases" (o haz clic [aquí](https://github.com/Murat-rat/SimpleFit/releases/tag/v1.0.0)).
2.  Descarga el archivo `.apk` de la última versión.
3.  Instálalo en tu dispositivo Android (asegúrate de permitir la instalación de orígenes desconocidos).
