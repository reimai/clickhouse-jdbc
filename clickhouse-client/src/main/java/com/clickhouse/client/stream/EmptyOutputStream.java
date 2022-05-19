package com.clickhouse.client.stream;

import java.io.IOException;

import com.clickhouse.client.ClickHouseDataUpdater;
import com.clickhouse.client.ClickHouseOutputStream;

/**
 * Empty output stream consumes nothing and it can never be closed.
 */
public final class EmptyOutputStream extends ClickHouseOutputStream {
    public static final EmptyOutputStream INSTANCE = new EmptyOutputStream();

    private EmptyOutputStream() {
        super(null, null);
    }

    @Override
    public boolean isClosed() {
        return false;
    }

    @Override
    public void close() throws IOException {
        // do nothing
    }

    @Override
    public ClickHouseOutputStream transferBytes(byte[] bytes, int offset, int length) throws IOException {
        return this;
    }

    @Override
    public ClickHouseOutputStream writeByte(byte b) throws IOException {
        return this;
    }

    @Override
    public ClickHouseOutputStream writeBytes(byte[] bytes, int offset, int length) throws IOException {
        return this;
    }

    @Override
    public ClickHouseOutputStream writeCustom(ClickHouseDataUpdater writer) throws IOException {
        return this;
    }
}
