

fun main() {
    var n = 10554000;
    var cnt0 = 0;
    var cnt5 = 0;
    while(true){
        if(n%10==0) cnt0++;
        if(n%10==5) cnt5++;
        n=n/10
        if (n<1) break;
    }
    var result = cnt0 + cnt5;
    println(result)

}