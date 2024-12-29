package org.example.electronic_devices;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import org.example.electronic_devices.Device;
import org.example.electronic_devices.Laptop;
import org.example.electronic_devices.Smartphone;
import org.example.electronic_devices.Tablet;

public class DeviceController {
    @FXML
    private TabPane tabPane;
    @FXML
    private ToggleGroup stylusToggleGroup;
    @FXML
    private RadioButton yesToggle;
    @FXML
    private RadioButton noToggle;
    @FXML
    private TextField nameFieldSmartphone;
    @FXML
    private TextField priceFieldSmartphone;
    @FXML
    private TextField weightFieldSmartphone;
    @FXML
    private TextField screenSizeField;
    @FXML
    private TextField cameraResolutionField;

    @FXML
    private TextField nameFieldLaptop;
    @FXML
    private TextField priceFieldLaptop;
    @FXML
    private TextField weightFieldLaptop;
    @FXML
    private TextField ramSizeField;
    @FXML
    private TextField processorTypeField;

    @FXML
    private TextField nameFieldTablet;
    @FXML
    private TextField priceFieldTablet;
    @FXML
    private TextField weightFieldTablet;
    @FXML
    private TextField batteryLifeField;
    @FXML
    private CheckBox hasStylusField;

    @FXML
    private ListView<Device> deviceListView;

    private ObservableList<Device> devices;

    public void initialize() {
        devices = FXCollections.observableArrayList();
        deviceListView.setItems(devices);
    }

    @FXML
    private void addSmartphone() {
        try {
            String name = nameFieldSmartphone.getText();
            double price = Double.parseDouble(priceFieldSmartphone.getText());
            double weight = Double.parseDouble(weightFieldSmartphone.getText());
            double screenSize = Double.parseDouble(screenSizeField.getText());
            double cameraResolution = Double.parseDouble(cameraResolutionField.getText());

            Smartphone smartphone = new Smartphone(name, price, weight, screenSize, cameraResolution);
            devices.add(smartphone);

            clearSmartphoneFields();
        } catch (NumberFormatException e) {
            showAlert("Invalid input", "Please enter valid numbers for price, weight, screen size, and camera resolution.");
        }
    }

    @FXML
    private void addLaptop() {
        try {
            String name = nameFieldLaptop.getText();
            double price = Double.parseDouble(priceFieldLaptop.getText());
            double weight = Double.parseDouble(weightFieldLaptop.getText());
            int ramSize = Integer.parseInt(ramSizeField.getText());
            String processorType = processorTypeField.getText();

            Laptop laptop = new Laptop(name, price, weight, ramSize, processorType);
            devices.add(laptop);

            clearLaptopFields();
        } catch (NumberFormatException e) {
            showAlert("Invalid input", "Please enter valid numbers for price, weight, and RAM size.");
        }
    }

    @FXML
    private void addTablet() {
        try {
            String name = nameFieldTablet.getText();
            double price = Double.parseDouble(priceFieldTablet.getText());
            double weight = Double.parseDouble(weightFieldTablet.getText());
            double batteryLife = Double.parseDouble(batteryLifeField.getText());
            boolean hasStylus = false;
            if (stylusToggleGroup.getSelectedToggle() != null) {
                hasStylus = stylusToggleGroup.getSelectedToggle().equals(yesToggle) ? true : false;
            }

            Tablet tablet = new Tablet(name, price, weight, batteryLife, hasStylus);
            devices.add(tablet);

            clearTabletFields();
        } catch (NumberFormatException e) {
            showAlert("Invalid input", "Please enter valid numbers for price, weight, and battery life.");
        }
    }

    @FXML
    private void removeSelectedDevice() {
        Device selectedDevice = deviceListView.getSelectionModel().getSelectedItem();
        if (selectedDevice != null) {
            devices.remove(selectedDevice);
        } else {
            showAlert("No selection", "Please select a device to remove.");
        }
    }

    private void clearSmartphoneFields() {
        nameFieldSmartphone.clear();
        priceFieldSmartphone.clear();
        weightFieldSmartphone.clear();
        screenSizeField.clear();
        cameraResolutionField.clear();
    }

    private void clearLaptopFields() {
        nameFieldLaptop.clear();
        priceFieldLaptop.clear();
        weightFieldLaptop.clear();
        ramSizeField.clear();
        processorTypeField.clear();
    }

    private void clearTabletFields() {
        nameFieldTablet.clear();
        priceFieldTablet.clear();
        weightFieldTablet.clear();
        batteryLifeField.clear();
        hasStylusField.setSelected(false);
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
