package com.github.sh0nk.matplotlib4j.builder;

import com.github.sh0nk.matplotlib4j.kwargs.Line2DBuilder;
import com.github.sh0nk.matplotlib4j.kwargs.Line2DBuilderImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;


public class PlotBuilderImpl implements PlotBuilder {

    private final static Logger LOGGER = LoggerFactory.getLogger(PlotBuilderImpl.class);

    private CompositeBuilder<PlotBuilder> innerBuilder = new CompositeBuilder<>(this);
    private Line2DBuilder<PlotBuilder> line2DBuilder = new Line2DBuilderImpl<>(innerBuilder);

    @Override
    public PlotBuilder add(List<? extends Number> x) {
        return innerBuilder.addToArgs(x);
    }

    @Override
    public PlotBuilder add(List<? extends Number> x, List<? extends Number> y) {
        innerBuilder.addToArgs(x);
        return innerBuilder.addToArgs(y);
    }

    @Override
    public PlotBuilder add(List<? extends Number> x, List<? extends Number> y, String fmt) {
        innerBuilder.addToArgs(x);
        innerBuilder.addToArgs(y);
        return innerBuilder.addToArgs(fmt);
    }

    @Override
    public PlotBuilder linestyle(String arg) {
        return line2DBuilder.linestyle(arg);
    }

    @Override
    public PlotBuilder ls(String arg) {
        return line2DBuilder.ls(arg);
    }

    @Override
    public PlotBuilder linewidth(String arg) {
        return line2DBuilder.linewidth(arg);
    }

    @Override
    public PlotBuilder lw(String arg) {
        return line2DBuilder.lw(arg);
    }

    @Override
    public PlotBuilder label(String arg) {
        return line2DBuilder.label(arg);
    }

    @Override
    public PlotBuilder marker(String arg) {
        return line2DBuilder.marker(arg);
    }

    @Override
    public PlotBuilder markevery(int arg) {
        return line2DBuilder.markevery(arg);
    }

    @Override
    public String build() {
        return innerBuilder.build();
    }

    @Override
    public String getMethodName() {
        return "plot";
    }
}
