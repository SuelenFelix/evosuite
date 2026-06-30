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

public class UserKop_hashCode_2030923721 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term281126;

    public UserKop_hashCode_2030923721() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term281132 = new Long(-3271370917942710167L);
        term281126 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserKop"));
        Object term281128 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term281130 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term281146 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term281147 = newInstance(Class.forName("java.time.LocalDate"));
        Object term281151 = newInstance(Class.forName("java.time.LocalTime"));
        Object term281156 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term281157 = newInstance(Class.forName("java.time.LocalDate"));
        Object term281161 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term281126, term281126.getClass(), "id", -8646159296666719313L);
        setLongField(term281128, term281128.getClass(), "id", -1865653774701731442L);
        setLongField(term281130, term281130.getClass(), "id", -4437018936264048290L);
        setField(term281130, term281130.getClass(), "extId", term281132);
        setField(term281130, term281130.getClass(), "luid", "CunxEcVQZW");
        setIntField(term281147, term281147.getClass(), "year", 2011);
        setShortField(term281147, term281147.getClass(), "month", (short) 5);
        setShortField(term281147, term281147.getClass(), "day", (short) 23);
        setField(term281146, term281146.getClass(), "date", term281147);
        setByteField(term281151, term281151.getClass(), "hour", (byte) 9);
        setByteField(term281151, term281151.getClass(), "minute", (byte) 18);
        setByteField(term281151, term281151.getClass(), "second", (byte) 11);
        setIntField(term281151, term281151.getClass(), "nano", 895323332);
        setField(term281146, term281146.getClass(), "time", term281151);
        setField(term281130, term281130.getClass(), "registerTime", term281146);
        setIntField(term281157, term281157.getClass(), "year", 2019);
        setShortField(term281157, term281157.getClass(), "month", (short) 8);
        setShortField(term281157, term281157.getClass(), "day", (short) 24);
        setField(term281156, term281156.getClass(), "date", term281157);
        setByteField(term281161, term281161.getClass(), "hour", (byte) 23);
        setByteField(term281161, term281161.getClass(), "minute", (byte) 48);
        setByteField(term281161, term281161.getClass(), "second", (byte) 54);
        setIntField(term281161, term281161.getClass(), "nano", 938546152);
        setField(term281156, term281156.getClass(), "time", term281161);
        setField(term281130, term281130.getClass(), "accessTime", term281156);
        setField(term281128, term281128.getClass(), "card", term281130);
        setField(term281128, term281128.getClass(), "userName", "SNbQDPikGp");
        setIntField(term281128, term281128.getClass(), "level", -1056218614);
        setIntField(term281128, term281128.getClass(), "reincarnationNum", -1061665653);
        setLongField(term281128, term281128.getClass(), "exp", 8170696155394503928L);
        setLongField(term281128, term281128.getClass(), "point", 5337657103827800266L);
        setLongField(term281128, term281128.getClass(), "totalPoint", -209056459170040540L);
        setIntField(term281128, term281128.getClass(), "playCount", -1873769204);
        setIntField(term281128, term281128.getClass(), "jewelCount", -1350811081);
        setIntField(term281128, term281128.getClass(), "totalJewelCount", -497996745);
        setIntField(term281128, term281128.getClass(), "medalCount", -109990303);
        setIntField(term281128, term281128.getClass(), "playerRating", 1201878250);
        setIntField(term281128, term281128.getClass(), "highestRating", -1105574919);
        setIntField(term281128, term281128.getClass(), "battlePoint", -493353713);
        setIntField(term281128, term281128.getClass(), "bestBattlePoint", 1715756304);
        setIntField(term281128, term281128.getClass(), "overDamageBattlePoint", 1885187356);
        setBooleanField(term281128, term281128.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term281128, term281128.getClass(), "nameplateId", -271697890);
        setIntField(term281128, term281128.getClass(), "trophyId", -1570345011);
        setIntField(term281128, term281128.getClass(), "cardId", 1881035539);
        setIntField(term281128, term281128.getClass(), "characterId", 1544914118);
        setIntField(term281128, term281128.getClass(), "characterVoiceNo", -946117068);
        setIntField(term281128, term281128.getClass(), "tabSetting", -1915677831);
        setIntField(term281128, term281128.getClass(), "tabSortSetting", 2065361934);
        setIntField(term281128, term281128.getClass(), "cardCategorySetting", 36380153);
        setIntField(term281128, term281128.getClass(), "cardSortSetting", 1825724677);
        setIntField(term281128, term281128.getClass(), "rivalScoreCategorySetting", -902676559);
        setIntField(term281128, term281128.getClass(), "playedTutorialBit", -1684112314);
        setIntField(term281128, term281128.getClass(), "firstTutorialCancelNum", -2067871215);
        setLongField(term281128, term281128.getClass(), "sumTechHighScore", 8960320654938253946L);
        setLongField(term281128, term281128.getClass(), "sumTechBasicHighScore", -7296919670924269620L);
        setLongField(term281128, term281128.getClass(), "sumTechAdvancedHighScore", -267109101105272172L);
        setLongField(term281128, term281128.getClass(), "sumTechExpertHighScore", -2033382108853741083L);
        setLongField(term281128, term281128.getClass(), "sumTechMasterHighScore", 7647525296736627363L);
        setLongField(term281128, term281128.getClass(), "sumTechLunaticHighScore", -2116187132775796480L);
        setLongField(term281128, term281128.getClass(), "sumBattleHighScore", 125383335839075226L);
        setLongField(term281128, term281128.getClass(), "sumBattleBasicHighScore", -5309986860328685837L);
        setLongField(term281128, term281128.getClass(), "sumBattleAdvancedHighScore", -2829386686100825063L);
        setLongField(term281128, term281128.getClass(), "sumBattleExpertHighScore", -4894705949834802248L);
        setLongField(term281128, term281128.getClass(), "sumBattleMasterHighScore", -5262302932872929554L);
        setLongField(term281128, term281128.getClass(), "sumBattleLunaticHighScore", -3929815839465813612L);
        setField(term281128, term281128.getClass(), "eventWatchedDate", "dCxylRMRqf");
        setField(term281128, term281128.getClass(), "cmEventWatchedDate", "MSwWSxHYib");
        setField(term281128, term281128.getClass(), "firstGameId", "bVOxJayYiq");
        setField(term281128, term281128.getClass(), "firstRomVersion", "qjysmKMiKT");
        setField(term281128, term281128.getClass(), "firstDataVersion", "IdvxsTXhfI");
        setField(term281128, term281128.getClass(), "firstPlayDate", "dqJbExUvup");
        setField(term281128, term281128.getClass(), "lastGameId", "TcgeOuVhBl");
        setField(term281128, term281128.getClass(), "lastRomVersion", "EsGOUSyjcl");
        setField(term281128, term281128.getClass(), "lastDataVersion", "MrcebsjLJc");
        setField(term281128, term281128.getClass(), "compatibleCmVersion", "WsgiRfUyFt");
        setField(term281128, term281128.getClass(), "lastPlayDate", "UeuvnYQTzK");
        setIntField(term281128, term281128.getClass(), "lastPlaceId", 1663028524);
        setField(term281128, term281128.getClass(), "lastPlaceName", "WIRsSxDEcQ");
        setIntField(term281128, term281128.getClass(), "lastRegionId", 1196325291);
        setField(term281128, term281128.getClass(), "lastRegionName", "gktMmpIJGy");
        setIntField(term281128, term281128.getClass(), "lastAllNetId", 826798931);
        setField(term281128, term281128.getClass(), "lastClientId", "yEUvvkNsJL");
        setIntField(term281128, term281128.getClass(), "lastUsedDeckId", 1471203421);
        setIntField(term281128, term281128.getClass(), "lastPlayMusicLevel", 461599979);
        setIntField(term281128, term281128.getClass(), "lastEmoneyBrand", -1949936263);
        setField(term281126, term281126.getClass(), "user", term281128);
        setField(term281126, term281126.getClass(), "authKey", "LeUPMkvgXk");
        setIntField(term281126, term281126.getClass(), "kopId", 2135782931);
        setIntField(term281126, term281126.getClass(), "areaId", -682620155);
        setIntField(term281126, term281126.getClass(), "totalTechScore", 1540269372);
        setIntField(term281126, term281126.getClass(), "totalPlatinumScore", 2079727503);
        setField(term281126, term281126.getClass(), "techRecordDate", "fiZsddQQDN");
        setBooleanField(term281126, term281126.getClass(), "isTotalTechNewRecord", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserKop");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term281126, args);
    }

};


