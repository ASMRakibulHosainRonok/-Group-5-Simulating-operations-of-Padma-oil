package cse.g5.Ashatit;

import javax.swing.text.TableView;

public class TrackFuelInventory
{
    @javafx.fxml.FXML
    private TableView inventoryTable;

    @javafx.fxml.FXML
    public void initialize() {
    }

    public TableView getInventoryTable() {
        return inventoryTable;
    }

    public void setInventoryTable(TableView inventoryTable) {
        this.inventoryTable = inventoryTable;
    }
}