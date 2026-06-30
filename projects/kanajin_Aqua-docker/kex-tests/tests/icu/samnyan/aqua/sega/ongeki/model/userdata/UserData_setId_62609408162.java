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

public class UserData_setId_62609408162 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48144;
     Object term48407;

    public UserData_setId_62609408162() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term48148 = new Long(-685023850445639859L);
        term48144 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term48146 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term48162 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term48163 = newInstance(Class.forName("java.time.LocalDate"));
        Object term48167 = newInstance(Class.forName("java.time.LocalTime"));
        Object term48172 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term48173 = newInstance(Class.forName("java.time.LocalDate"));
        Object term48177 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term48144, term48144.getClass(), "id", -4303254485153363630L);
        setLongField(term48146, term48146.getClass(), "id", -6459891615024824682L);
        setField(term48146, term48146.getClass(), "extId", term48148);
        setField(term48146, term48146.getClass(), "luid", "XlNXxsYNss");
        setIntField(term48163, term48163.getClass(), "year", 2023);
        setShortField(term48163, term48163.getClass(), "month", (short) 5);
        setShortField(term48163, term48163.getClass(), "day", (short) 19);
        setField(term48162, term48162.getClass(), "date", term48163);
        setByteField(term48167, term48167.getClass(), "hour", (byte) 20);
        setByteField(term48167, term48167.getClass(), "minute", (byte) 50);
        setByteField(term48167, term48167.getClass(), "second", (byte) 49);
        setIntField(term48167, term48167.getClass(), "nano", 806710892);
        setField(term48162, term48162.getClass(), "time", term48167);
        setField(term48146, term48146.getClass(), "registerTime", term48162);
        setIntField(term48173, term48173.getClass(), "year", 2022);
        setShortField(term48173, term48173.getClass(), "month", (short) 8);
        setShortField(term48173, term48173.getClass(), "day", (short) 3);
        setField(term48172, term48172.getClass(), "date", term48173);
        setByteField(term48177, term48177.getClass(), "hour", (byte) 18);
        setByteField(term48177, term48177.getClass(), "minute", (byte) 3);
        setByteField(term48177, term48177.getClass(), "second", (byte) 33);
        setIntField(term48177, term48177.getClass(), "nano", 770583920);
        setField(term48172, term48172.getClass(), "time", term48177);
        setField(term48146, term48146.getClass(), "accessTime", term48172);
        setField(term48144, term48144.getClass(), "card", term48146);
        setField(term48144, term48144.getClass(), "userName", "jheRZWjuaB");
        setIntField(term48144, term48144.getClass(), "level", 192932780);
        setIntField(term48144, term48144.getClass(), "reincarnationNum", -902517932);
        setLongField(term48144, term48144.getClass(), "exp", 4404944231648782138L);
        setLongField(term48144, term48144.getClass(), "point", -7960465355740029962L);
        setLongField(term48144, term48144.getClass(), "totalPoint", -7641504744663354190L);
        setIntField(term48144, term48144.getClass(), "playCount", 2043141938);
        setIntField(term48144, term48144.getClass(), "jewelCount", 51110531);
        setIntField(term48144, term48144.getClass(), "totalJewelCount", -142424158);
        setIntField(term48144, term48144.getClass(), "medalCount", 360866091);
        setIntField(term48144, term48144.getClass(), "playerRating", -1711966798);
        setIntField(term48144, term48144.getClass(), "highestRating", 414375178);
        setIntField(term48144, term48144.getClass(), "battlePoint", -189623871);
        setIntField(term48144, term48144.getClass(), "bestBattlePoint", -1500608395);
        setIntField(term48144, term48144.getClass(), "overDamageBattlePoint", -1957666898);
        setBooleanField(term48144, term48144.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term48144, term48144.getClass(), "nameplateId", -1073146570);
        setIntField(term48144, term48144.getClass(), "trophyId", -898083613);
        setIntField(term48144, term48144.getClass(), "cardId", 1072590759);
        setIntField(term48144, term48144.getClass(), "characterId", -261873217);
        setIntField(term48144, term48144.getClass(), "characterVoiceNo", 275234848);
        setIntField(term48144, term48144.getClass(), "tabSetting", -400500781);
        setIntField(term48144, term48144.getClass(), "tabSortSetting", -1811725314);
        setIntField(term48144, term48144.getClass(), "cardCategorySetting", -1802258300);
        setIntField(term48144, term48144.getClass(), "cardSortSetting", -407739204);
        setIntField(term48144, term48144.getClass(), "rivalScoreCategorySetting", 551650321);
        setIntField(term48144, term48144.getClass(), "playedTutorialBit", 1863609082);
        setIntField(term48144, term48144.getClass(), "firstTutorialCancelNum", 346023694);
        setLongField(term48144, term48144.getClass(), "sumTechHighScore", 2973367088695686720L);
        setLongField(term48144, term48144.getClass(), "sumTechBasicHighScore", 3957586217570224080L);
        setLongField(term48144, term48144.getClass(), "sumTechAdvancedHighScore", 8593688994010397171L);
        setLongField(term48144, term48144.getClass(), "sumTechExpertHighScore", -4702186846634836119L);
        setLongField(term48144, term48144.getClass(), "sumTechMasterHighScore", -8068180925713934318L);
        setLongField(term48144, term48144.getClass(), "sumTechLunaticHighScore", -5687439958444660557L);
        setLongField(term48144, term48144.getClass(), "sumBattleHighScore", 643414393920888432L);
        setLongField(term48144, term48144.getClass(), "sumBattleBasicHighScore", -3982367954172699860L);
        setLongField(term48144, term48144.getClass(), "sumBattleAdvancedHighScore", 7153115868701511726L);
        setLongField(term48144, term48144.getClass(), "sumBattleExpertHighScore", 3042394513611697851L);
        setLongField(term48144, term48144.getClass(), "sumBattleMasterHighScore", 4021900249730695810L);
        setLongField(term48144, term48144.getClass(), "sumBattleLunaticHighScore", 3053042769254952980L);
        setField(term48144, term48144.getClass(), "eventWatchedDate", "IERziToRSQ");
        setField(term48144, term48144.getClass(), "cmEventWatchedDate", "mDTRMwjBpc");
        setField(term48144, term48144.getClass(), "firstGameId", "sCLAuKoiVL");
        setField(term48144, term48144.getClass(), "firstRomVersion", "pFWiDEnVnU");
        setField(term48144, term48144.getClass(), "firstDataVersion", "NeEetzFhTt");
        setField(term48144, term48144.getClass(), "firstPlayDate", "UgvuvUxKed");
        setField(term48144, term48144.getClass(), "lastGameId", "ljBBMsQpaM");
        setField(term48144, term48144.getClass(), "lastRomVersion", "hHNIOlOzJc");
        setField(term48144, term48144.getClass(), "lastDataVersion", "ALRSeULyWV");
        setField(term48144, term48144.getClass(), "compatibleCmVersion", "WVhzXHdyFF");
        setField(term48144, term48144.getClass(), "lastPlayDate", "GLAWYoxkyw");
        setIntField(term48144, term48144.getClass(), "lastPlaceId", 1378096239);
        setField(term48144, term48144.getClass(), "lastPlaceName", "cfpPTNNVnW");
        setIntField(term48144, term48144.getClass(), "lastRegionId", -1082231594);
        setField(term48144, term48144.getClass(), "lastRegionName", "VPkEFShMUB");
        setIntField(term48144, term48144.getClass(), "lastAllNetId", -1775141108);
        setField(term48144, term48144.getClass(), "lastClientId", "ZIgHysIFcL");
        setIntField(term48144, term48144.getClass(), "lastUsedDeckId", -606500993);
        setIntField(term48144, term48144.getClass(), "lastPlayMusicLevel", 475994339);
        setIntField(term48144, term48144.getClass(), "lastEmoneyBrand", -460066219);
        term48407 = new Long(-1613345286663863879L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term48407;
        callMethod(klass, "setId", argTypes, term48144, args);
    }

};


