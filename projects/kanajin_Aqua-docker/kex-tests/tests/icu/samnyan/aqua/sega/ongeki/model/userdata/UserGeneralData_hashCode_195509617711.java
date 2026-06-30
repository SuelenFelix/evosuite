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

public class UserGeneralData_hashCode_195509617711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term299374;

    public UserGeneralData_hashCode_195509617711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term299380 = new Long(-823085399570394644L);
        term299374 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserGeneralData"));
        Object term299376 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term299378 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term299394 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term299395 = newInstance(Class.forName("java.time.LocalDate"));
        Object term299399 = newInstance(Class.forName("java.time.LocalTime"));
        Object term299404 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term299405 = newInstance(Class.forName("java.time.LocalDate"));
        Object term299409 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term299374, term299374.getClass(), "id", -3589995151455396301L);
        setLongField(term299376, term299376.getClass(), "id", -466944020425524694L);
        setLongField(term299378, term299378.getClass(), "id", -4526991880985217429L);
        setField(term299378, term299378.getClass(), "extId", term299380);
        setField(term299378, term299378.getClass(), "luid", "NOaxSWPYxb");
        setIntField(term299395, term299395.getClass(), "year", 2013);
        setShortField(term299395, term299395.getClass(), "month", (short) 3);
        setShortField(term299395, term299395.getClass(), "day", (short) 17);
        setField(term299394, term299394.getClass(), "date", term299395);
        setByteField(term299399, term299399.getClass(), "hour", (byte) 13);
        setByteField(term299399, term299399.getClass(), "minute", (byte) 47);
        setByteField(term299399, term299399.getClass(), "second", (byte) 51);
        setIntField(term299399, term299399.getClass(), "nano", 910194729);
        setField(term299394, term299394.getClass(), "time", term299399);
        setField(term299378, term299378.getClass(), "registerTime", term299394);
        setIntField(term299405, term299405.getClass(), "year", 2022);
        setShortField(term299405, term299405.getClass(), "month", (short) 10);
        setShortField(term299405, term299405.getClass(), "day", (short) 17);
        setField(term299404, term299404.getClass(), "date", term299405);
        setByteField(term299409, term299409.getClass(), "hour", (byte) 20);
        setByteField(term299409, term299409.getClass(), "minute", (byte) 20);
        setByteField(term299409, term299409.getClass(), "second", (byte) 44);
        setIntField(term299409, term299409.getClass(), "nano", 756805002);
        setField(term299404, term299404.getClass(), "time", term299409);
        setField(term299378, term299378.getClass(), "accessTime", term299404);
        setField(term299376, term299376.getClass(), "card", term299378);
        setField(term299376, term299376.getClass(), "userName", "tJAeYhYvPl");
        setIntField(term299376, term299376.getClass(), "level", 327476744);
        setIntField(term299376, term299376.getClass(), "reincarnationNum", -508705336);
        setLongField(term299376, term299376.getClass(), "exp", 937050083097205915L);
        setLongField(term299376, term299376.getClass(), "point", -7653758826086621481L);
        setLongField(term299376, term299376.getClass(), "totalPoint", -3848857771675958131L);
        setIntField(term299376, term299376.getClass(), "playCount", 1034385825);
        setIntField(term299376, term299376.getClass(), "jewelCount", -1420297071);
        setIntField(term299376, term299376.getClass(), "totalJewelCount", 211681645);
        setIntField(term299376, term299376.getClass(), "medalCount", -1657976520);
        setIntField(term299376, term299376.getClass(), "playerRating", 1474921203);
        setIntField(term299376, term299376.getClass(), "highestRating", 73878857);
        setIntField(term299376, term299376.getClass(), "battlePoint", -447250309);
        setIntField(term299376, term299376.getClass(), "bestBattlePoint", -178193495);
        setIntField(term299376, term299376.getClass(), "overDamageBattlePoint", 2143659831);
        setBooleanField(term299376, term299376.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term299376, term299376.getClass(), "nameplateId", -1837062636);
        setIntField(term299376, term299376.getClass(), "trophyId", -2041717100);
        setIntField(term299376, term299376.getClass(), "cardId", 2125086466);
        setIntField(term299376, term299376.getClass(), "characterId", 896387936);
        setIntField(term299376, term299376.getClass(), "characterVoiceNo", 1820045723);
        setIntField(term299376, term299376.getClass(), "tabSetting", 1832320421);
        setIntField(term299376, term299376.getClass(), "tabSortSetting", -2077745055);
        setIntField(term299376, term299376.getClass(), "cardCategorySetting", 806903399);
        setIntField(term299376, term299376.getClass(), "cardSortSetting", 325287087);
        setIntField(term299376, term299376.getClass(), "rivalScoreCategorySetting", -43935060);
        setIntField(term299376, term299376.getClass(), "playedTutorialBit", -1302688690);
        setIntField(term299376, term299376.getClass(), "firstTutorialCancelNum", -564901008);
        setLongField(term299376, term299376.getClass(), "sumTechHighScore", -7952631855437339829L);
        setLongField(term299376, term299376.getClass(), "sumTechBasicHighScore", -8089265099186908132L);
        setLongField(term299376, term299376.getClass(), "sumTechAdvancedHighScore", -388419507910514088L);
        setLongField(term299376, term299376.getClass(), "sumTechExpertHighScore", -3088432946750931171L);
        setLongField(term299376, term299376.getClass(), "sumTechMasterHighScore", 4898777441641397453L);
        setLongField(term299376, term299376.getClass(), "sumTechLunaticHighScore", 9101201645804505150L);
        setLongField(term299376, term299376.getClass(), "sumBattleHighScore", -3282898961048010368L);
        setLongField(term299376, term299376.getClass(), "sumBattleBasicHighScore", 8518102582899321963L);
        setLongField(term299376, term299376.getClass(), "sumBattleAdvancedHighScore", -1310940021658341043L);
        setLongField(term299376, term299376.getClass(), "sumBattleExpertHighScore", -1553067027871702925L);
        setLongField(term299376, term299376.getClass(), "sumBattleMasterHighScore", 2928450339073656671L);
        setLongField(term299376, term299376.getClass(), "sumBattleLunaticHighScore", 4160543358225188075L);
        setField(term299376, term299376.getClass(), "eventWatchedDate", "PwerdBbWmr");
        setField(term299376, term299376.getClass(), "cmEventWatchedDate", "QoaNPXGspI");
        setField(term299376, term299376.getClass(), "firstGameId", "HGsYknyqnw");
        setField(term299376, term299376.getClass(), "firstRomVersion", "nSSaTIcgNB");
        setField(term299376, term299376.getClass(), "firstDataVersion", "XjDbTjwIhO");
        setField(term299376, term299376.getClass(), "firstPlayDate", "zcTaqvZYPD");
        setField(term299376, term299376.getClass(), "lastGameId", "VcPYeZWbaV");
        setField(term299376, term299376.getClass(), "lastRomVersion", "vZXmZnJkmA");
        setField(term299376, term299376.getClass(), "lastDataVersion", "DLsTUONaVG");
        setField(term299376, term299376.getClass(), "compatibleCmVersion", "CMxBJvoWmb");
        setField(term299376, term299376.getClass(), "lastPlayDate", "gxdAZEpSgS");
        setIntField(term299376, term299376.getClass(), "lastPlaceId", -219093089);
        setField(term299376, term299376.getClass(), "lastPlaceName", "JKJdAtnrrF");
        setIntField(term299376, term299376.getClass(), "lastRegionId", -2028403078);
        setField(term299376, term299376.getClass(), "lastRegionName", "GpoyHXGieZ");
        setIntField(term299376, term299376.getClass(), "lastAllNetId", 558371378);
        setField(term299376, term299376.getClass(), "lastClientId", "cEFsvMVCTU");
        setIntField(term299376, term299376.getClass(), "lastUsedDeckId", 1822911019);
        setIntField(term299376, term299376.getClass(), "lastPlayMusicLevel", -534095671);
        setIntField(term299376, term299376.getClass(), "lastEmoneyBrand", -1534777670);
        setField(term299374, term299374.getClass(), "user", term299376);
        setField(term299374, term299374.getClass(), "propertyKey", "AqNriHImMY");
        setField(term299374, term299374.getClass(), "propertyValue", "mwSajMxzKy");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserGeneralData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term299374, args);
    }

};


