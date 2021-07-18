//adicionamos para que ele entenda que e um modulo, para dizer o que sera visto
module digital.innovation.one.core {
    //captura os exports que sao feitos no outro modulo
    //maioria dos imports devem ser feitos por aqui exceto os padroes como array list
    requires digital.innovation.one.utils;
    requires java.sql;
}