package icu.samnyan.aqua.sega.maimai.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;
import java.lang.Integer;

public class UserMusicDetail_setMusicId_164146948115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term184323;
     Object term184509;

    public UserMusicDetail_setMusicId_164146948115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term184329 = new Long(-3048863932438585863L);
        term184323 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserMusicDetail"));
        Object term184325 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term184327 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term184343 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term184344 = newInstance(Class.forName("java.time.LocalDate"));
        Object term184348 = newInstance(Class.forName("java.time.LocalTime"));
        Object term184353 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term184354 = newInstance(Class.forName("java.time.LocalDate"));
        Object term184358 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term184323, term184323.getClass(), "id", -7862819468419399203L);
        setLongField(term184325, term184325.getClass(), "id", -8433455023051048992L);
        setLongField(term184327, term184327.getClass(), "id", 2135057416650245432L);
        setField(term184327, term184327.getClass(), "extId", term184329);
        setField(term184327, term184327.getClass(), "luid", "MmpIaMLtIl");
        setIntField(term184344, term184344.getClass(), "year", 2010);
        setShortField(term184344, term184344.getClass(), "month", (short) 11);
        setShortField(term184344, term184344.getClass(), "day", (short) 25);
        setField(term184343, term184343.getClass(), "date", term184344);
        setByteField(term184348, term184348.getClass(), "hour", (byte) 5);
        setByteField(term184348, term184348.getClass(), "minute", (byte) 46);
        setByteField(term184348, term184348.getClass(), "second", (byte) 1);
        setIntField(term184348, term184348.getClass(), "nano", 136465643);
        setField(term184343, term184343.getClass(), "time", term184348);
        setField(term184327, term184327.getClass(), "registerTime", term184343);
        setIntField(term184354, term184354.getClass(), "year", 2018);
        setShortField(term184354, term184354.getClass(), "month", (short) 12);
        setShortField(term184354, term184354.getClass(), "day", (short) 3);
        setField(term184353, term184353.getClass(), "date", term184354);
        setByteField(term184358, term184358.getClass(), "hour", (byte) 10);
        setByteField(term184358, term184358.getClass(), "minute", (byte) 38);
        setByteField(term184358, term184358.getClass(), "second", (byte) 13);
        setIntField(term184358, term184358.getClass(), "nano", 962636679);
        setField(term184353, term184353.getClass(), "time", term184358);
        setField(term184327, term184327.getClass(), "accessTime", term184353);
        setField(term184325, term184325.getClass(), "card", term184327);
        setIntField(term184325, term184325.getClass(), "lastDataVersion", -1626758581);
        setField(term184325, term184325.getClass(), "userName", "NdxOgIeywq");
        setIntField(term184325, term184325.getClass(), "point", 147670886);
        setIntField(term184325, term184325.getClass(), "totalPoint", 1280026535);
        setIntField(term184325, term184325.getClass(), "iconId", 1525803536);
        setIntField(term184325, term184325.getClass(), "nameplateId", 354074636);
        setIntField(term184325, term184325.getClass(), "frameId", 185167650);
        setIntField(term184325, term184325.getClass(), "trophyId", -2136232368);
        setIntField(term184325, term184325.getClass(), "playCount", -798751697);
        setIntField(term184325, term184325.getClass(), "playVsCount", -1648269458);
        setIntField(term184325, term184325.getClass(), "playSyncCount", -1603211128);
        setIntField(term184325, term184325.getClass(), "winCount", 39740509);
        setIntField(term184325, term184325.getClass(), "helpCount", 1539578631);
        setIntField(term184325, term184325.getClass(), "comboCount", 1077781754);
        setIntField(term184325, term184325.getClass(), "feverCount", 456106074);
        setIntField(term184325, term184325.getClass(), "totalHiScore", -1795304646);
        setIntField(term184325, term184325.getClass(), "totalEasyHighScore", 1964870534);
        setIntField(term184325, term184325.getClass(), "totalBasicHighScore", -276890808);
        setIntField(term184325, term184325.getClass(), "totalAdvancedHighScore", 1559068287);
        setIntField(term184325, term184325.getClass(), "totalExpertHighScore", 397407294);
        setIntField(term184325, term184325.getClass(), "totalMasterHighScore", -223293699);
        setIntField(term184325, term184325.getClass(), "totalReMasterHighScore", -1796100464);
        setIntField(term184325, term184325.getClass(), "totalHighSync", -426845179);
        setIntField(term184325, term184325.getClass(), "totalEasySync", 1607366760);
        setIntField(term184325, term184325.getClass(), "totalBasicSync", 297745082);
        setIntField(term184325, term184325.getClass(), "totalAdvancedSync", -1063471743);
        setIntField(term184325, term184325.getClass(), "totalExpertSync", -1765647000);
        setIntField(term184325, term184325.getClass(), "totalMasterSync", 1496906);
        setIntField(term184325, term184325.getClass(), "totalReMasterSync", -731867659);
        setIntField(term184325, term184325.getClass(), "playerRating", 1743610705);
        setIntField(term184325, term184325.getClass(), "highestRating", 66477332);
        setIntField(term184325, term184325.getClass(), "rankAuthTailId", 1448597828);
        setField(term184325, term184325.getClass(), "eventWatchedDate", "CVVuyKTkfU");
        setField(term184325, term184325.getClass(), "webLimitDate", "kVJJpdqrcb");
        setIntField(term184325, term184325.getClass(), "challengeTrackPhase", 1048685039);
        setIntField(term184325, term184325.getClass(), "firstPlayBits", -1395974380);
        setField(term184325, term184325.getClass(), "lastPlayDate", "lrxpxFLOlO");
        setIntField(term184325, term184325.getClass(), "lastPlaceId", -807177688);
        setField(term184325, term184325.getClass(), "lastPlaceName", "TlaWwdzyFj");
        setIntField(term184325, term184325.getClass(), "lastRegionId", -953085707);
        setField(term184325, term184325.getClass(), "lastRegionName", "JFwtRLPoHH");
        setField(term184325, term184325.getClass(), "lastClientId", "PkFqFUDNRB");
        setField(term184325, term184325.getClass(), "lastCountryCode", "JTaFYFigKc");
        setIntField(term184325, term184325.getClass(), "eventPoint", 1551446104);
        setIntField(term184325, term184325.getClass(), "totalLv", -178340783);
        setIntField(term184325, term184325.getClass(), "lastLoginBonusDay", -512614532);
        setIntField(term184325, term184325.getClass(), "lastSurvivalBonusDay", -1882458129);
        setIntField(term184325, term184325.getClass(), "loginBonusLv", 1821557744);
        setField(term184323, term184323.getClass(), "user", term184325);
        setIntField(term184323, term184323.getClass(), "musicId", 2141079762);
        setIntField(term184323, term184323.getClass(), "level", 1771957989);
        setIntField(term184323, term184323.getClass(), "playCount", -4349271);
        setIntField(term184323, term184323.getClass(), "scoreMax", -926566543);
        setIntField(term184323, term184323.getClass(), "syncRateMax", -77110340);
        setBooleanField(term184323, term184323.getClass(), "isAllPerfect", true);
        setIntField(term184323, term184323.getClass(), "isAllPerfectPlus", -916947785);
        setIntField(term184323, term184323.getClass(), "fullCombo", 1824210873);
        setIntField(term184323, term184323.getClass(), "maxFever", 818411180);
        setIntField(term184323, term184323.getClass(), "achievement", -805342754);
        term184509 = new Integer(1838364554);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term184509;
        callMethod(klass, "setMusicId", argTypes, term184323, args);
    }

};


