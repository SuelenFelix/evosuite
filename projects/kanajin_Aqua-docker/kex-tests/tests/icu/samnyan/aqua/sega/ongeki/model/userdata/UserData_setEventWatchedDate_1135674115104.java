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

public class UserData_setEventWatchedDate_1135674115104 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66058;

    public UserData_setEventWatchedDate_1135674115104() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term66062 = new Long(-8603648071751666348L);
        term66058 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term66060 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term66076 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term66077 = newInstance(Class.forName("java.time.LocalDate"));
        Object term66081 = newInstance(Class.forName("java.time.LocalTime"));
        Object term66086 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term66087 = newInstance(Class.forName("java.time.LocalDate"));
        Object term66091 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term66058, term66058.getClass(), "id", -677383924825139585L);
        setLongField(term66060, term66060.getClass(), "id", 3676304089995045597L);
        setField(term66060, term66060.getClass(), "extId", term66062);
        setField(term66060, term66060.getClass(), "luid", "vhjxsMJjOh");
        setIntField(term66077, term66077.getClass(), "year", 2016);
        setShortField(term66077, term66077.getClass(), "month", (short) 5);
        setShortField(term66077, term66077.getClass(), "day", (short) 9);
        setField(term66076, term66076.getClass(), "date", term66077);
        setByteField(term66081, term66081.getClass(), "hour", (byte) 1);
        setByteField(term66081, term66081.getClass(), "minute", (byte) 20);
        setByteField(term66081, term66081.getClass(), "second", (byte) 56);
        setIntField(term66081, term66081.getClass(), "nano", 198437232);
        setField(term66076, term66076.getClass(), "time", term66081);
        setField(term66060, term66060.getClass(), "registerTime", term66076);
        setIntField(term66087, term66087.getClass(), "year", 2021);
        setShortField(term66087, term66087.getClass(), "month", (short) 2);
        setShortField(term66087, term66087.getClass(), "day", (short) 5);
        setField(term66086, term66086.getClass(), "date", term66087);
        setByteField(term66091, term66091.getClass(), "hour", (byte) 20);
        setByteField(term66091, term66091.getClass(), "minute", (byte) 43);
        setByteField(term66091, term66091.getClass(), "second", (byte) 37);
        setIntField(term66091, term66091.getClass(), "nano", 191661361);
        setField(term66086, term66086.getClass(), "time", term66091);
        setField(term66060, term66060.getClass(), "accessTime", term66086);
        setField(term66058, term66058.getClass(), "card", term66060);
        setField(term66058, term66058.getClass(), "userName", "gKgsqLPDCs");
        setIntField(term66058, term66058.getClass(), "level", -1122695171);
        setIntField(term66058, term66058.getClass(), "reincarnationNum", -1304945951);
        setLongField(term66058, term66058.getClass(), "exp", 9176995849424666996L);
        setLongField(term66058, term66058.getClass(), "point", -3212680229932754821L);
        setLongField(term66058, term66058.getClass(), "totalPoint", -8974514191774285441L);
        setIntField(term66058, term66058.getClass(), "playCount", 1324880713);
        setIntField(term66058, term66058.getClass(), "jewelCount", -331841554);
        setIntField(term66058, term66058.getClass(), "totalJewelCount", 913848623);
        setIntField(term66058, term66058.getClass(), "medalCount", 1449221084);
        setIntField(term66058, term66058.getClass(), "playerRating", -217809217);
        setIntField(term66058, term66058.getClass(), "highestRating", -473949548);
        setIntField(term66058, term66058.getClass(), "battlePoint", 1898831696);
        setIntField(term66058, term66058.getClass(), "bestBattlePoint", 1811064455);
        setIntField(term66058, term66058.getClass(), "overDamageBattlePoint", 1183674366);
        setBooleanField(term66058, term66058.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term66058, term66058.getClass(), "nameplateId", 2120314865);
        setIntField(term66058, term66058.getClass(), "trophyId", -1783088801);
        setIntField(term66058, term66058.getClass(), "cardId", 353452001);
        setIntField(term66058, term66058.getClass(), "characterId", -1160759211);
        setIntField(term66058, term66058.getClass(), "characterVoiceNo", 118302577);
        setIntField(term66058, term66058.getClass(), "tabSetting", -1192086944);
        setIntField(term66058, term66058.getClass(), "tabSortSetting", 1689097670);
        setIntField(term66058, term66058.getClass(), "cardCategorySetting", -229058840);
        setIntField(term66058, term66058.getClass(), "cardSortSetting", -445086770);
        setIntField(term66058, term66058.getClass(), "rivalScoreCategorySetting", 1555977804);
        setIntField(term66058, term66058.getClass(), "playedTutorialBit", -1039875364);
        setIntField(term66058, term66058.getClass(), "firstTutorialCancelNum", -908724029);
        setLongField(term66058, term66058.getClass(), "sumTechHighScore", -4546853968080919834L);
        setLongField(term66058, term66058.getClass(), "sumTechBasicHighScore", 1281872419462997592L);
        setLongField(term66058, term66058.getClass(), "sumTechAdvancedHighScore", -700098407024972610L);
        setLongField(term66058, term66058.getClass(), "sumTechExpertHighScore", 8346130120381478068L);
        setLongField(term66058, term66058.getClass(), "sumTechMasterHighScore", -2325777595445399907L);
        setLongField(term66058, term66058.getClass(), "sumTechLunaticHighScore", -3514785447628222010L);
        setLongField(term66058, term66058.getClass(), "sumBattleHighScore", -5108468977208772556L);
        setLongField(term66058, term66058.getClass(), "sumBattleBasicHighScore", 505876240564658953L);
        setLongField(term66058, term66058.getClass(), "sumBattleAdvancedHighScore", 7742764755721559987L);
        setLongField(term66058, term66058.getClass(), "sumBattleExpertHighScore", -8991703742842083780L);
        setLongField(term66058, term66058.getClass(), "sumBattleMasterHighScore", 5615941840917152622L);
        setLongField(term66058, term66058.getClass(), "sumBattleLunaticHighScore", -4465594170502445650L);
        setField(term66058, term66058.getClass(), "eventWatchedDate", "crZAQIKgDI");
        setField(term66058, term66058.getClass(), "cmEventWatchedDate", "uDAdogNiBQ");
        setField(term66058, term66058.getClass(), "firstGameId", "GnPrxkKUmR");
        setField(term66058, term66058.getClass(), "firstRomVersion", "gVgLmqgxMh");
        setField(term66058, term66058.getClass(), "firstDataVersion", "QWknVCpJTU");
        setField(term66058, term66058.getClass(), "firstPlayDate", "XhnCbWwpIr");
        setField(term66058, term66058.getClass(), "lastGameId", "BVMUadSiyU");
        setField(term66058, term66058.getClass(), "lastRomVersion", "OhWrgFwvJi");
        setField(term66058, term66058.getClass(), "lastDataVersion", "DfKWXfTINQ");
        setField(term66058, term66058.getClass(), "compatibleCmVersion", "KqusFIxuyo");
        setField(term66058, term66058.getClass(), "lastPlayDate", "CDpvEYMuDg");
        setIntField(term66058, term66058.getClass(), "lastPlaceId", 1122198417);
        setField(term66058, term66058.getClass(), "lastPlaceName", "YaZCAiIUPe");
        setIntField(term66058, term66058.getClass(), "lastRegionId", 1853596233);
        setField(term66058, term66058.getClass(), "lastRegionName", "KsCWHUcJDd");
        setIntField(term66058, term66058.getClass(), "lastAllNetId", 995880114);
        setField(term66058, term66058.getClass(), "lastClientId", "zkYsnzzwJu");
        setIntField(term66058, term66058.getClass(), "lastUsedDeckId", -375101902);
        setIntField(term66058, term66058.getClass(), "lastPlayMusicLevel", -400603688);
        setIntField(term66058, term66058.getClass(), "lastEmoneyBrand", 2063246363);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "hxHKgOYyQD";
        callMethod(klass, "setEventWatchedDate", argTypes, term66058, args);
    }

};


