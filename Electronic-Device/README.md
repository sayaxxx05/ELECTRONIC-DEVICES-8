

# Electronic Device Manager

## Description
The **Electronic Device Manager** is a JavaFX application that models different types of electronic devices using object-oriented programming principles. The program includes a base class (`Device`) and three specific device types (`Smartphone`, `Laptop`, `Tablet`) that inherit from it. The application also provides a user-friendly GUI to add, display, and remove devices, showcasing the use of inheritance and encapsulation in Java.

## Features
1. **Device Modeling**: Inheritance-based structure with a base `Device` class and derived classes (`Smartphone`, `Laptop`, `Tablet`), each with specific attributes.
2. **GUI for User Interaction**:
   - **Tab Selection**: Allows selection between device types.
   - **Input Fields**: Custom fields for each device type to input details.
   - **Device Management**: Buttons to add and remove devices, with a `ListView` to display added devices.
3. **Dynamic Device List**: The `ListView` dynamically updates as devices are added or removed, utilizing an `ObservableList`.

## Class Structure

### 1. `Device` (Base Class)
- **Attributes**:
  - `type` (Enum): Device type (SMARTPHONE, LAPTOP, TABLET)
  - `name` (String): Name of the device
  - `price` (Double): Price of the device
  - `weight` (Double): Weight of the device
- **Methods**:
  - Parameterized constructor for initialization
  - Getters and setters for all attributes

### 2. Derived Classes
Each class inherits from `Device` and has additional unique attributes.

#### `Smartphone`
- **Attributes**:
  - `screenSize` (double): Size of the screen
  - `cameraResolution` (double): Camera resolution

#### `Laptop`
- **Attributes**:
  - `ramSize` (int): RAM size
  - `processorType` (String): Processor type

#### `Tablet`
- **Attributes**:
  - `batteryLife` (double): Battery life
  - `hasStylus` (boolean): Indicates if it includes a stylus

## GUI Overview
The JavaFX GUI includes:
- **TabPane**: Allows the user to switch between "Smartphone", "Laptop", and "Tablet" to input device details.
- **Input Fields**: Text fields to enter the name, price, and weight, as well as specific fields for each device type.
- **Add Button**: Adds the device to an observable list when clicked.
- **ListView**: Displays the list of devices, dynamically updated as devices are added or removed.
- **Remove Button**: Removes a selected device from the list.

### Usage
1. Select the device type from the tabs.
2. Enter details in the input fields specific to the selected device type.
3. Click "Add" to add the device to the list.
4. The device will appear in the `ListView`.
5. Select a device in the list and click "Remove" to delete it.

### Sample Inputs

#### Smartphone
- **Name**: iPhone
- **Price**: 999.99
- **Weight**: 0.174
- **Screen Size**: 6.1
- **Camera Resolution**: 12

#### Laptop
- **Name**: MacBook Pro
- **Price**: 1299.99
- **Weight**: 1.4
- **RAM Size**: 16
- **Processor Type**: M1

#### Tablet
- **Name**: iPad
- **Price**: 799.99
- **Weight**: 0.458
- **Battery Life**: 10
- **Has Stylus**: Yes

### Screenshots
#### Main Interface
<img width="594" alt="Снимок экрана 2024-11-05 в 23 26 49" src="https://github.com/user-attachments/assets/2ac46d20-bc95-4686-9c05-7c03e5178b5d">
<img width="962" alt="Снимок экрана 2024-11-05 в 23 36 16" src="https://github.com/user-attachments/assets/ae2a4c17-2658-48ff-af76-1df3eaa2f3fe">
