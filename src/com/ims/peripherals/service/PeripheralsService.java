package com.ims.peripherals.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.ims.peripherals.model.ComputerAssigneeData;
import com.ims.peripherals.model.Peripherals;
import com.ims.utilities.SystemStatus;

public interface PeripheralsService {
	List<Peripherals> getPeripherals() throws SQLException;

	SystemStatus insertNewPeripherals(Peripherals peripheral) throws SQLException;

	List<Peripherals> getPeripheralRecord(HttpServletRequest request) throws SQLException;

	List<Peripherals> getPeripherals(HttpServletRequest request) throws SQLException;

	Integer getPeripheralNo() throws SQLException;

	SystemStatus updatePeripheral(Peripherals peripheral) throws SQLException;

	List<ComputerAssigneeData> getComputerAssigneeData(Integer unitNo) throws SQLException;
	
	SystemStatus deletePeripheral(Integer no) throws SQLException;
	
	SystemStatus savePeripheral(List<Peripherals> sessionPeripherals) throws SQLException;
}
