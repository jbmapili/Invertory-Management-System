package com.ims.peripherals.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.ims.peripherals.model.ComputerAssigneeData;
import com.ims.peripherals.model.Peripherals;
import com.ims.utilities.SystemStatus;

public interface DaoPeripherals {
	List<Peripherals> getPeripherals() throws SQLException;

	SystemStatus insertNewPeripherals(Map<String, Object> params) throws SQLException;

	List<Peripherals> getPeripheralRecord(int id) throws SQLException;

	List<Peripherals> getPeripherals(String no) throws SQLException;

	Integer getPeripheralNo() throws SQLException;

	SystemStatus updatePeripheral(Map<String, Object> params) throws SQLException;

	List<ComputerAssigneeData> getComputerAssigneeData(Integer unitNo) throws SQLException;
	
	SystemStatus deletePeripheral(Integer no) throws SQLException;
	
	SystemStatus savePeripherals(List<Peripherals> sessionPeripherals) throws SQLException;
}
