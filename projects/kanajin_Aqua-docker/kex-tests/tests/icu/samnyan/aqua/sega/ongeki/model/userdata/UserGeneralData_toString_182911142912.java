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

public class UserGeneralData_toString_182911142912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term299843;

    public UserGeneralData_toString_182911142912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term299849 = new Long(-894705411488729365L);
        term299843 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserGeneralData"));
        Object term299845 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term299847 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term299863 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term299864 = newInstance(Class.forName("java.time.LocalDate"));
        Object term299868 = newInstance(Class.forName("java.time.LocalTime"));
        Object term299873 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term299874 = newInstance(Class.forName("java.time.LocalDate"));
        Object term299878 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term299843, term299843.getClass(), "id", 939324052258763182L);
        setLongField(term299845, term299845.getClass(), "id", 311672101306315858L);
        setLongField(term299847, term299847.getClass(), "id", 624287327011571144L);
        setField(term299847, term299847.getClass(), "extId", term299849);
        setField(term299847, term299847.getClass(), "luid", "mmzfmREmvG");
        setIntField(term299864, term299864.getClass(), "year", 2023);
        setShortField(term299864, term299864.getClass(), "month", (short) 6);
        setShortField(term299864, term299864.getClass(), "day", (short) 26);
        setField(term299863, term299863.getClass(), "date", term299864);
        setByteField(term299868, term299868.getClass(), "hour", (byte) 14);
        setByteField(term299868, term299868.getClass(), "minute", (byte) 53);
        setByteField(term299868, term299868.getClass(), "second", (byte) 55);
        setIntField(term299868, term299868.getClass(), "nano", 121097351);
        setField(term299863, term299863.getClass(), "time", term299868);
        setField(term299847, term299847.getClass(), "registerTime", term299863);
        setIntField(term299874, term299874.getClass(), "year", 2017);
        setShortField(term299874, term299874.getClass(), "month", (short) 6);
        setShortField(term299874, term299874.getClass(), "day", (short) 20);
        setField(term299873, term299873.getClass(), "date", term299874);
        setByteField(term299878, term299878.getClass(), "hour", (byte) 22);
        setByteField(term299878, term299878.getClass(), "minute", (byte) 51);
        setByteField(term299878, term299878.getClass(), "second", (byte) 8);
        setIntField(term299878, term299878.getClass(), "nano", 735893362);
        setField(term299873, term299873.getClass(), "time", term299878);
        setField(term299847, term299847.getClass(), "accessTime", term299873);
        setField(term299845, term299845.getClass(), "card", term299847);
        setField(term299845, term299845.getClass(), "userName", "QDgqKUuIMf");
        setIntField(term299845, term299845.getClass(), "level", -2005406967);
        setIntField(term299845, term299845.getClass(), "reincarnationNum", -822537859);
        setLongField(term299845, term299845.getClass(), "exp", 7748743510896349045L);
        setLongField(term299845, term299845.getClass(), "point", -4523042657703985709L);
        setLongField(term299845, term299845.getClass(), "totalPoint", -3045861555099358188L);
        setIntField(term299845, term299845.getClass(), "playCount", 1119061107);
        setIntField(term299845, term299845.getClass(), "jewelCount", -1919220943);
        setIntField(term299845, term299845.getClass(), "totalJewelCount", 1308178262);
        setIntField(term299845, term299845.getClass(), "medalCount", 1564520542);
        setIntField(term299845, term299845.getClass(), "playerRating", 1387355611);
        setIntField(term299845, term299845.getClass(), "highestRating", -751672506);
        setIntField(term299845, term299845.getClass(), "battlePoint", 1204529239);
        setIntField(term299845, term299845.getClass(), "bestBattlePoint", 1225429252);
        setIntField(term299845, term299845.getClass(), "overDamageBattlePoint", -2032958068);
        setBooleanField(term299845, term299845.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term299845, term299845.getClass(), "nameplateId", 1067007941);
        setIntField(term299845, term299845.getClass(), "trophyId", -1416820614);
        setIntField(term299845, term299845.getClass(), "cardId", -169661887);
        setIntField(term299845, term299845.getClass(), "characterId", 1700120818);
        setIntField(term299845, term299845.getClass(), "characterVoiceNo", 558238943);
        setIntField(term299845, term299845.getClass(), "tabSetting", -1097705713);
        setIntField(term299845, term299845.getClass(), "tabSortSetting", 618373929);
        setIntField(term299845, term299845.getClass(), "cardCategorySetting", -1394505936);
        setIntField(term299845, term299845.getClass(), "cardSortSetting", -19521419);
        setIntField(term299845, term299845.getClass(), "rivalScoreCategorySetting", 1204448062);
        setIntField(term299845, term299845.getClass(), "playedTutorialBit", -513774345);
        setIntField(term299845, term299845.getClass(), "firstTutorialCancelNum", -1872752847);
        setLongField(term299845, term299845.getClass(), "sumTechHighScore", 7174883069718331857L);
        setLongField(term299845, term299845.getClass(), "sumTechBasicHighScore", -3217015068304782906L);
        setLongField(term299845, term299845.getClass(), "sumTechAdvancedHighScore", 7760542292971159845L);
        setLongField(term299845, term299845.getClass(), "sumTechExpertHighScore", -7729158747711999719L);
        setLongField(term299845, term299845.getClass(), "sumTechMasterHighScore", 8108814974575222871L);
        setLongField(term299845, term299845.getClass(), "sumTechLunaticHighScore", -4787697808210403075L);
        setLongField(term299845, term299845.getClass(), "sumBattleHighScore", -2589455473307091181L);
        setLongField(term299845, term299845.getClass(), "sumBattleBasicHighScore", -147129628476314015L);
        setLongField(term299845, term299845.getClass(), "sumBattleAdvancedHighScore", 3281256089757833847L);
        setLongField(term299845, term299845.getClass(), "sumBattleExpertHighScore", 6425945386126260766L);
        setLongField(term299845, term299845.getClass(), "sumBattleMasterHighScore", -8638493666182328434L);
        setLongField(term299845, term299845.getClass(), "sumBattleLunaticHighScore", 4742738360268611860L);
        setField(term299845, term299845.getClass(), "eventWatchedDate", "KSrOHHauRF");
        setField(term299845, term299845.getClass(), "cmEventWatchedDate", "crvtEHvIWK");
        setField(term299845, term299845.getClass(), "firstGameId", "glDRFmYutu");
        setField(term299845, term299845.getClass(), "firstRomVersion", "HfTMHxIhyF");
        setField(term299845, term299845.getClass(), "firstDataVersion", "nwmhNXaAzK");
        setField(term299845, term299845.getClass(), "firstPlayDate", "AHKEcReWeg");
        setField(term299845, term299845.getClass(), "lastGameId", "vQJCcjYzFl");
        setField(term299845, term299845.getClass(), "lastRomVersion", "mXQgfYcOFG");
        setField(term299845, term299845.getClass(), "lastDataVersion", "sXBPfVUQIw");
        setField(term299845, term299845.getClass(), "compatibleCmVersion", "uVQuCdoyqo");
        setField(term299845, term299845.getClass(), "lastPlayDate", "idDWMqSfdr");
        setIntField(term299845, term299845.getClass(), "lastPlaceId", 580237461);
        setField(term299845, term299845.getClass(), "lastPlaceName", "COnaqgWCuo");
        setIntField(term299845, term299845.getClass(), "lastRegionId", -1473031622);
        setField(term299845, term299845.getClass(), "lastRegionName", "vnCQFMDnJC");
        setIntField(term299845, term299845.getClass(), "lastAllNetId", 1304762160);
        setField(term299845, term299845.getClass(), "lastClientId", "bCkDkObuRH");
        setIntField(term299845, term299845.getClass(), "lastUsedDeckId", 944524029);
        setIntField(term299845, term299845.getClass(), "lastPlayMusicLevel", -744266172);
        setIntField(term299845, term299845.getClass(), "lastEmoneyBrand", 1703599286);
        setField(term299843, term299843.getClass(), "user", term299845);
        setField(term299843, term299843.getClass(), "propertyKey", "fXsvnPoTrp");
        setField(term299843, term299843.getClass(), "propertyValue", "nfPBEOploM");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserGeneralData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term299843, args);
    }

};


