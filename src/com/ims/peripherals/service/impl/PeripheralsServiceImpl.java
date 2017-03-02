package com.ims.peripherals.service.impl;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.ims.peripherals.dao.impl.DaoPeripheralsImpl;
import com.ims.peripherals.model.ComputerAssigneeData;
import com.ims.peripherals.model.Peripherals;
import com.ims.peripherals.service.PeripheralsService;
import com.ims.utilities.SystemStatus;

public class PeripheralsServiceImpl implements PeripheralsService {
	private DaoPeripheralsImpl dao;

	public DaoPeripheralsImpl getDao() {
		return dao;
	}

	public void setDao(DaoPeripheralsImpl dao) {
		this.dao = dao;
	}

	@Override
	public List<Peripherals> getPeripherals() throws SQLException {
		return this.getDao().getPeripherals();
	}

	@Override
	public SystemStatus insertNewPeripherals(Peripherals peripheral) throws SQLException {

		Map<String, Object> params = new HashMap<>();
		params.put("unitNo", peripheral.getUnitNo());
		params.put("peripheralNo", peripheral.getPeripheralNo());
		params.put("serialNo", peripheral.getSerialNo());
		params.put("peripheralType", peripheral.getPeripheralType());
		params.put("brand", peripheral.getBrand());
		params.put("tagNumber", peripheral.getTagNumber());
		params.put("model", peripheral.getModel());
		params.put("acquiredDate", peripheral.getAcquiredDate());
		params.put("color", peripheral.getColor());
		params.put("description", peripheral.getColor());
		params.put("userId", peripheral.getUserId());
		params.put("remarks", peripheral.getRemarks());

		return this.getDao().insertNewPeripherals(params);
	}

	@Override
	public List<Peripherals> getPeripheralRecord(HttpServletRequest request) throws SQLException {

		int id = Integer.parseInt(request.getParameter("peripheralId"));

		return this.getDao().getPeripheralRecord(id);
	}

	@Override
	public List<Peripherals> getPeripherals(HttpServletRequest request) throws SQLException {
		String no = (request.getParameter("num"));
		System.out.println(no);
		return this.getDao().getPeripherals(no);
	}

	@Override
	public Integer getPeripheralNo() throws SQLException {
		return this.getDao().getPeripheralNo();
	}

	@Override
	public SystemStatus updatePeripheral(Peripherals peripheral) throws SQLException {
		Map<String, Object> params = new HashMap<>();
		params.put("peripheralNo", peripheral.getPeripheralNo());
		params.put("peripheralType", peripheral.getPeripheralType());
		params.put("tagNumber", peripheral.getTagNumber());
		params.put("acquiredDate", peripheral.getAcquiredDate());
		params.put("description", peripheral.getDescription());
		params.put("serialNo", peripheral.getSerialNo());
		params.put("brand", peripheral.getBrand());
		params.put("model", peripheral.getModel());
		params.put("color", peripheral.getColor());
		params.put("remarks", peripheral.getRemarks());
		params.put("userId", peripheral.getUserId());

		return this.getDao().updatePeripheral(params);
	}

	@Override
	public List<ComputerAssigneeData> getComputerAssigneeData(Integer unitNo) throws SQLException {
		return this.getDao().getComputerAssigneeData(unitNo);
	}

	@Override
	public SystemStatus deletePeripheral(Integer no) throws SQLException {
		return this.getDao().deletePeripheral(no);
	}

	@Override
	public SystemStatus savePeripheral(List<Peripherals> sessionPeripherals) throws SQLException {
		return this.getDao().savePeripherals(sessionPeripherals);
	}
}
