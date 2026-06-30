package icu.samnyan.aqua.sega.ongeki.model.userdata;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static icu.samnyan.aqua.sega.ongeki.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class UserItem_init_7221266200 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term102588;

    public UserItem_init_7221266200() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term102592 = new Long(3238645206498300107L);
        term102588 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term102590 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term102606 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term102607 = newInstance(Class.forName("java.time.LocalDate"));
        Object term102611 = newInstance(Class.forName("java.time.LocalTime"));
        Object term102616 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term102617 = newInstance(Class.forName("java.time.LocalDate"));
        Object term102621 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term102588, term102588.getClass(), "id", -1827011306138353528L);
        setLongField(term102590, term102590.getClass(), "id", -1541278924689136810L);
        setField(term102590, term102590.getClass(), "extId", term102592);
        setField(term102590, term102590.getClass(), "luid", "xNKBQkfPIU");
        setIntField(term102607, term102607.getClass(), "year", 2014);
        setShortField(term102607, term102607.getClass(), "month", (short) 5);
        setShortField(term102607, term102607.getClass(), "day", (short) 5);
        setField(term102606, term102606.getClass(), "date", term102607);
        setByteField(term102611, term102611.getClass(), "hour", (byte) 17);
        setByteField(term102611, term102611.getClass(), "minute", (byte) 28);
        setByteField(term102611, term102611.getClass(), "second", (byte) 52);
        setIntField(term102611, term102611.getClass(), "nano", 741253436);
        setField(term102606, term102606.getClass(), "time", term102611);
        setField(term102590, term102590.getClass(), "registerTime", term102606);
        setIntField(term102617, term102617.getClass(), "year", 2015);
        setShortField(term102617, term102617.getClass(), "month", (short) 3);
        setShortField(term102617, term102617.getClass(), "day", (short) 23);
        setField(term102616, term102616.getClass(), "date", term102617);
        setByteField(term102621, term102621.getClass(), "hour", (byte) 7);
        setByteField(term102621, term102621.getClass(), "minute", (byte) 27);
        setByteField(term102621, term102621.getClass(), "second", (byte) 38);
        setIntField(term102621, term102621.getClass(), "nano", 467385263);
        setField(term102616, term102616.getClass(), "time", term102621);
        setField(term102590, term102590.getClass(), "accessTime", term102616);
        setField(term102588, term102588.getClass(), "card", term102590);
        setField(term102588, term102588.getClass(), "userName", "IaRILCkXUB");
        setIntField(term102588, term102588.getClass(), "level", 768323855);
        setIntField(term102588, term102588.getClass(), "reincarnationNum", -346585829);
        setLongField(term102588, term102588.getClass(), "exp", 3370913951731278257L);
        setLongField(term102588, term102588.getClass(), "point", -8561144190874118120L);
        setLongField(term102588, term102588.getClass(), "totalPoint", -8161974836877108744L);
        setIntField(term102588, term102588.getClass(), "playCount", -1575960315);
        setIntField(term102588, term102588.getClass(), "jewelCount", -514683546);
        setIntField(term102588, term102588.getClass(), "totalJewelCount", 1234114047);
        setIntField(term102588, term102588.getClass(), "medalCount", 781355790);
        setIntField(term102588, term102588.getClass(), "playerRating", 549100322);
        setIntField(term102588, term102588.getClass(), "highestRating", 398153902);
        setIntField(term102588, term102588.getClass(), "battlePoint", 377234030);
        setIntField(term102588, term102588.getClass(), "bestBattlePoint", 1874512723);
        setIntField(term102588, term102588.getClass(), "overDamageBattlePoint", 1522351738);
        setBooleanField(term102588, term102588.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term102588, term102588.getClass(), "nameplateId", 1017805089);
        setIntField(term102588, term102588.getClass(), "trophyId", -1625168727);
        setIntField(term102588, term102588.getClass(), "cardId", 1507365243);
        setIntField(term102588, term102588.getClass(), "characterId", -1212284162);
        setIntField(term102588, term102588.getClass(), "characterVoiceNo", -1956243783);
        setIntField(term102588, term102588.getClass(), "tabSetting", 33967357);
        setIntField(term102588, term102588.getClass(), "tabSortSetting", -1227252559);
        setIntField(term102588, term102588.getClass(), "cardCategorySetting", 1636889912);
        setIntField(term102588, term102588.getClass(), "cardSortSetting", 1695339680);
        setIntField(term102588, term102588.getClass(), "rivalScoreCategorySetting", 79521146);
        setIntField(term102588, term102588.getClass(), "playedTutorialBit", 1295906354);
        setIntField(term102588, term102588.getClass(), "firstTutorialCancelNum", 980180400);
        setLongField(term102588, term102588.getClass(), "sumTechHighScore", 2414751913272857198L);
        setLongField(term102588, term102588.getClass(), "sumTechBasicHighScore", 5631636010149656965L);
        setLongField(term102588, term102588.getClass(), "sumTechAdvancedHighScore", 9083023389109779559L);
        setLongField(term102588, term102588.getClass(), "sumTechExpertHighScore", 5259536683055374610L);
        setLongField(term102588, term102588.getClass(), "sumTechMasterHighScore", -6261765077527362927L);
        setLongField(term102588, term102588.getClass(), "sumTechLunaticHighScore", -5033229053418942258L);
        setLongField(term102588, term102588.getClass(), "sumBattleHighScore", 2634970689877661559L);
        setLongField(term102588, term102588.getClass(), "sumBattleBasicHighScore", -299054155457724028L);
        setLongField(term102588, term102588.getClass(), "sumBattleAdvancedHighScore", 6592361866954566506L);
        setLongField(term102588, term102588.getClass(), "sumBattleExpertHighScore", -4430640238371361796L);
        setLongField(term102588, term102588.getClass(), "sumBattleMasterHighScore", -4412379824210027388L);
        setLongField(term102588, term102588.getClass(), "sumBattleLunaticHighScore", 3481375031536067233L);
        setField(term102588, term102588.getClass(), "eventWatchedDate", "XRaUSsHhJf");
        setField(term102588, term102588.getClass(), "cmEventWatchedDate", "ndknwPavsb");
        setField(term102588, term102588.getClass(), "firstGameId", "XbwSBHmjuZ");
        setField(term102588, term102588.getClass(), "firstRomVersion", "vHdYsSmEmG");
        setField(term102588, term102588.getClass(), "firstDataVersion", "UDIVCqBmxp");
        setField(term102588, term102588.getClass(), "firstPlayDate", "npyBQorcHP");
        setField(term102588, term102588.getClass(), "lastGameId", "pzvYCQwkoA");
        setField(term102588, term102588.getClass(), "lastRomVersion", "TGLDiqWTkO");
        setField(term102588, term102588.getClass(), "lastDataVersion", "NwjEUxXUkk");
        setField(term102588, term102588.getClass(), "compatibleCmVersion", "CFBoXISoRu");
        setField(term102588, term102588.getClass(), "lastPlayDate", "gRmiKAUyCW");
        setIntField(term102588, term102588.getClass(), "lastPlaceId", -128299328);
        setField(term102588, term102588.getClass(), "lastPlaceName", "rfXVAViErl");
        setIntField(term102588, term102588.getClass(), "lastRegionId", 668320250);
        setField(term102588, term102588.getClass(), "lastRegionName", "GcMaBtNShc");
        setIntField(term102588, term102588.getClass(), "lastAllNetId", -2078852356);
        setField(term102588, term102588.getClass(), "lastClientId", "kqGufqJbqf");
        setIntField(term102588, term102588.getClass(), "lastUsedDeckId", 381868688);
        setIntField(term102588, term102588.getClass(), "lastPlayMusicLevel", -1312990054);
        setIntField(term102588, term102588.getClass(), "lastEmoneyBrand", -741512095);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Object[] args = new Object[1];
        args[0] = term102588;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


