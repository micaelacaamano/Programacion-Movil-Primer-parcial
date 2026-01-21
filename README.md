# Programación Móvil – Primer Parcial

Este repositorio contiene el desarrollo correspondiente al **Primer Parcial de la materia Programación Móvil**, perteneciente a la **Tecnicatura Superior en Desarrollo de Software**.

La aplicación fue desarrollada en **Android Studio**, utilizando **Gradle** como sistema de build y **Java** como lenguaje de programación.

---

## 🎯 Objetivo del Parcial

Aplicar los conocimientos iniciales de desarrollo móvil en Android mediante la creación de una aplicación funcional, haciendo uso correcto de **Activities**, **Layouts**, componentes de interfaz y lógica de negocio básica.

---

## 🛠️ Tecnologías utilizadas

- **Lenguaje:** Java  
- **IDE:** Android Studio  
- **Build system:** Gradle  
- **Plataforma:** Android  

---

## Consigna del Primer Parcial

Desarrollar una aplicación Android que permita calcular el importe del alquiler de bicicletas, aplicando distintos criterios según el tipo de bicicleta, forma de pago y moneda seleccionada.

---

## Funcionalidades obligatorias

### 1️⃣ Interfaz gráfica
- Implementar un **Activity** como el indicado en la consigna.
- Uso correcto de **Layouts** para organizar los componentes de la interfaz.

### 2️⃣ Cálculo del importe base
Calcular el importe a abonar según el **tipo de bicicleta** y la cantidad de horas:

- Bicicleta de montaña: **$1000 ARS por hora**
- Bicicleta urbana: **$2000 ARS por hora**
- Bicicleta eléctrica: **$4000 ARS por hora**

📌 **Casco adicional:**  
- Si se selecciona casco, se debe **adicionar un 20%** al importe total.

---

### 3️⃣ Forma de pago
Aplicar modificaciones al importe final según la forma de pago elegida:

- **Efectivo:** descuento del **20%**
- **Transferencia:** descuento del **10%**
- **Tarjeta en cuotas:** aumento del **10%**

📌 El importe final debe mostrarse **con dos decimales**.

---

### 4️⃣ Conversión de moneda
- Implementar un **Switch** que permita alternar el precio entre:
  - **Pesos Argentinos (ARS)**
  - **Dólares Americanos (USD)**

💱 **Tasa de referencia:**  
`1 USD = 1000 ARS`

---

## 🌟 Funcionalidades extra (10% cada una)

- 🔔 Mostrar un **Toast** indicando el **tipo de bicicleta seleccionado** al presionar un `RadioButton`.
- 🧹 Implementar un **Button o ImageButton** que permita **limpiar la pantalla** y restaurar los valores por defecto.

---

## Criterios de evaluación

El parcial fue evaluado teniendo en cuenta:

- Correcta implementación de la interfaz
- Funcionamiento de los cálculos
- Uso adecuado de componentes Android
- Claridad del código
- Cumplimiento de las funcionalidades solicitadas

---

- 🐱‍💻 GitHub: https://github.com/micaelacaamano  
- 💼 LinkedIn: https://www.linkedin.com/in/micacaam/

