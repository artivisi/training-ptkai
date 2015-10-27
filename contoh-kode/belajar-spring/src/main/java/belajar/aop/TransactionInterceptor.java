package belajar.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;


public class TransactionInterceptor implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation mi) throws Throwable {
        // ini dipanggil sebelum method yang aslinya
        System.out.println("DB Transaction : Begin");

        // pemanggilan method asli yang ada di target object
        Object hasil = mi.proceed();

        // ini dipanggil setelah method asli selesai dijalankan
        System.out.println("DB Transaction : Commit");

        // return value dari method asli, kita keluarkan supaya bisa digunakan
        // oleh interceptor lain
        return hasil;
    }

}
