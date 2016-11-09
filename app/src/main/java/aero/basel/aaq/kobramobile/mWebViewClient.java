package aero.basel.aaq.kobramobile;

import android.webkit.WebView;
import android.webkit.WebViewClient;

public class mWebViewClient extends WebViewClient {

    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        if (url.contains("62.183.37.114")) {
            view.loadUrl(url);
        }
        return true;
    }

    @Override
    public void onPageFinished(WebView view, String url) {

        view.loadUrl("javascript:(function(){document.body.innerHTML = document.body.innerHTML.replace(/Предупреждения/g,'Предупреждения подробные')})()");
        view.loadUrl("javascript:(function(){document.body.innerHTML = document.body.innerHTML.replace(/BLND/g,'Слепой пассажир')})()");
        view.loadUrl("javascript:(function(){document.body.innerHTML = document.body.innerHTML.replace(/DEAF/g,'Глухой пассажир')})()");
        view.loadUrl("javascript:(function(){document.body.innerHTML = document.body.innerHTML.replace(/WCBD/g,'Инвалидная коляска с сухо-заряженными батареями')})()");
        view.loadUrl("javascript:(function(){document.body.innerHTML = document.body.innerHTML.replace(/WCBW/g,'Инвалидная коляска с влажно-заряженными батареями')})()");
        view.loadUrl("javascript:(function(){document.body.innerHTML = document.body.innerHTML.replace(/WCHS/g,'Для инвалидного кресла необходим амбулифт')})()");
        view.loadUrl("javascript:(function(){document.body.innerHTML = document.body.innerHTML.replace(/WCHC/g,'Для инвалидного кресла необходим амбулифт')})()");
        view.loadUrl("javascript:(function(){document.body.innerHTML = document.body.innerHTML.replace(/WCHR/g,'Для инвалидного кресла необходим амбулифт')})()");
        view.loadUrl("javascript:(function(){document.body.innerHTML = document.body.innerHTML.replace(/WCMP/g,'Для инвалидного кресла необходим амбулифт')})()");
        view.loadUrl("javascript:(function(){document.body.innerHTML = document.body.innerHTML.replace(/INFT/g,'Младенец, несовершеннолетний')})()");
        view.loadUrl("javascript:(function(){document.body.innerHTML = document.body.innerHTML.replace(/UMNR/g,'Несовершеннолетние без сопровождения')})()");
        view.loadUrl("javascript:(function(){document.body.innerHTML = document.body.innerHTML.replace(/MAAS/g,'Встреча и сопровождение')})()");
        view.loadUrl("javascript:(function(){document.body.innerHTML = document.body.innerHTML.replace(/MEDA/g,'Сопровождение медиков')})()");
        view.loadUrl("javascript:(function(){document.body.innerHTML = document.body.innerHTML.replace(/OXYG/g,'Пассажиру необходим кислород')})()");
        view.loadUrl("javascript:(function(){document.body.innerHTML = document.body.innerHTML.replace(/STCR/g,'Пассажир на носилках')})()");
        view.loadUrl("javascript:(function(){document.body.innerHTML = document.body.innerHTML.replace(/AVIH/g,'Животные в клетке')})()");
        view.loadUrl("javascript:(function(){document.body.innerHTML = document.body.innerHTML.replace(/PETC/g,'Пассажир с животными')})()");
        view.loadUrl("javascript:(function(){document.body.innerHTML = document.body.innerHTML.replace(/SPEQ/g,'Спортивный инвентарь')})()");
        view.loadUrl("javascript:(function(){document.body.innerHTML = document.body.innerHTML.replace(/BIKE/g,'Велосипед перевозится в виде сопровождаемого багажа')})()");
        view.loadUrl("javascript:(function(){document.body.innerHTML = document.body.innerHTML.replace(/BSCT/g,'Детская люлька, коляска')})()");
        view.loadUrl("javascript:(function(){document.body.innerHTML = document.body.innerHTML.replace(/BULK/g,'Крупногабаритный багаж')})()");
        view.loadUrl("javascript:(function(){document.body.innerHTML = document.body.innerHTML.replace(/CBBG/g,'Ручная кладь (приобретено дополнительное место)')})()");
        view.loadUrl("javascript:(function(){document.body.innerHTML = document.body.innerHTML.replace(/CCAR/g,'Компактный автомобиль')})()");
        view.loadUrl("javascript:(function(){document.body.innerHTML = document.body.innerHTML.replace(/EXST/g,'Дополнительное место на борту судна')})()");
        view.loadUrl("javascript:(function(){document.body.innerHTML = document.body.innerHTML.replace(/XBAG/g,'Дополнительный багаж')})()");
        view.loadUrl("javascript:(function(){document.body.innerHTML = document.body.innerHTML.replace(/WEAP/g,'Ружья и прочее оружие')})()");
        view.loadUrl("javascript:(function(){document.body.innerHTML = document.body.innerHTML.replace(/FRAG/g,'Хрупкий багаж')})()");
        view.loadUrl("javascript:(function(){document.body.innerHTML = document.body.innerHTML.replace(/DEPA/g,'Депортируемый в сопровождении эскорта')})()");
        view.loadUrl("javascript:(function(){document.body.innerHTML = document.body.innerHTML.replace(/DEPU/g,'Не сопровождаемый депортируемый пассажир')})()");
        view.loadUrl("javascript:(function(){document.body.innerHTML = document.body.innerHTML.replace(/DPNA/g,'Инвалиды  с умственными или отклонениями в развитии')})()");
        view.loadUrl("javascript:(function(){document.body.innerHTML = document.body.innerHTML.replace(/TWOV/g,'Транзитный пассажир без визы')})()");
        view.loadUrl("javascript:(function(){document.body.innerHTML = document.body.innerHTML.replace(/OTHS/g,'Разное')})()");
        view.loadUrl("javascript:(function(){document.body.innerHTML = document.body.innerHTML.replace(/CKIN/g,'Информация для персонала аэропорта')})()");
        view.loadUrl("javascript:(function(){document.body.innerHTML = document.body.innerHTML.replace(/SEMN/g,'Моряк, член экипажа судна')})()");
        view.loadUrl("javascript:(function(){document.body.innerHTML = document.body.innerHTML.replace(/SEAT/g,'Посадочный талон на забронированное место')})()");
        }


}
