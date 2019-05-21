package com.github.sh0nk.matplotlib4j.kwargs;

import com.github.sh0nk.matplotlib4j.builder.Builder;

public interface Line2DBuilder<T extends Builder> extends KwargsBuilder {

    T linestyle(String arg);

    T ls(String arg);

    T linewidth(String arg);

    T lw(String arg);

    T label(String arg);

    T marker(String arg);

    T markevery(int arg);

}
