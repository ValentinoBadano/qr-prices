# qr-prices
Sistema de carga y consulta de precios con código QR. Este es un proyecto para la materia de POO.

# Descripción

Se desea modelar y desarrollar un software para mostrar los importes de los productos en góndola a partir de un código QR, evitando a la administración de la empresa tener que modificar continuamente las etiquetas con los importes de los productos.

El software contará con 3 perfiles de usuarios:

* Administrador de empresas.
* Gestor de productos de una empresa.
* Perfil público que escanea el código (Código QR) de un producto y se abre la ficha del producto.


# Funcionalidades

### Gestión de empresas (Rol Administrador)

**Listado**: La página listará todas las empresas en el sistema ordenadas primero por su condición de activo (los activos se listan primero) y luego alfabéticamente por nombre. De cada empresa se mostrará su razón social, cuit, logo y si se encuentra como activo. Sobre cada empresa de la lista tendremos la posibilidad de acceder a su ficha con sus datos, editarla y poder marcarla como activo o inactivo. Desde está vista además podremos acceder a dar de alta de una nueva empresa.

**Alta**: Esta página tendrá un formulario que permite completar los datos para el registro de un nuevo producto al sistema. Todos los campos de este formulario son requeridos y obligatorios salvo el logo y el color. No se podrá crear un nuevo producto si alguno de estos campos es omitido.

**Edición**: Esta página tendrá un formulario que permite actualizar los datos de un producto en el sistema.

**Ficha de empresa**: Esta página permitirá visualizar todos los datos de la empresa. Desde está página tendremos la posibilidad de acceder a la edición y la activación/inactivación de la empresa.

**Inactivación**: Está acción permite establecer como inactivo una empresa en el sistema. La inactivación establece en false el valor booleano del atributo activo del producto. Solo se podrá inactivar un socio que se encuentra activo.

**Activación**: Está acción permite establecer como activa a una empresa en el sistema. La activación establece en true el valor booleano del atributo activo de la Empresa. Solo se podrá activar una empresa que se encuentra en estado inactivo.

### Gestión de productos (Rol Gestor)

**Listado**: La página listará todos los productos de la empresa registrados en el sistema ordenados primero por su condición de activo (los activos se listan primero) y luego alfabéticamente por nombre. De cada producto se mostrará su nombre, descripción, código y si se encuentra como activo. Sobre cada producto de la lista tendremos la posibilidad de acceder a su ficha con sus datos, editarlo y poder marcarlo como activo o inactivo. Desde está vista además podremos acceder a dar de alta a un nuevo producto.

**Alta**: Esta página tendrá un formulario que permite completar los datos para el registro de un nuevo producto al sistema. Todos los campos de este formulario son requeridos y obligatorios salvo la imagen y el idSistemaGestion(Si la empresa tiene un sistema de gestión podrá asociar ese código a nuestro sistema). No se podrá crear un nuevo producto si alguno de estos campos es omitido.

**Edición**: Esta página tendrá un formulario que permite actualizar los datos de un producto en el sistema. Solo se podrán actualizar los datos: importe, nombre y descripción.

**Ficha de producto**: Esta página permitirá visualizar todos los datos del producto. Desde está página tendremos la posibilidad de acceder a la edición y la activación/inactivación del producto.

**Inactivación**: Está acción permite establecer como inactivo un producto en el sistema. Cualquier usuario podrá inactivar un producto de su empresa. La inactivación establece en false el valor booleano del atributo activo del producto. Solo se podrá inactivar un socio que se encuentra activo.

**Activación**: Está acción permite establecer como activo un socio en el sistema. Cualquier usuario podrá activar a un socio. La activación establece en true el valor booleano del atributo activo del Socio. Solo se podrá activar un socio que se encuentra inactivo.

**Impresión de código QR**: Está acción permite generar un pdf de un código QR del link completo de la “ficha pública de producto” que se explica a continuación. 


### Visualización de productos (público)

**Ficha pública de producto**: página que será accedida sin login (públicamente). Podrá ser acceda a través del escaneo del código QR escaneado desde la góndola de la empresa.
