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

public class UserEventMusic_equals_5526383521 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term379019;
     Object term379303;

    public UserEventMusic_equals_5526383521() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term379025 = new Long(-7966859634511305171L);
        term379019 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserEventMusic"));
        Object term379021 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term379023 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term379039 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term379040 = newInstance(Class.forName("java.time.LocalDate"));
        Object term379044 = newInstance(Class.forName("java.time.LocalTime"));
        Object term379049 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term379050 = newInstance(Class.forName("java.time.LocalDate"));
        Object term379054 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term379019, term379019.getClass(), "id", 3580992269763685767L);
        setLongField(term379021, term379021.getClass(), "id", -4585967123940069823L);
        setLongField(term379023, term379023.getClass(), "id", 2555661825173190540L);
        setField(term379023, term379023.getClass(), "extId", term379025);
        setField(term379023, term379023.getClass(), "luid", "iYncdDHnkA");
        setIntField(term379040, term379040.getClass(), "year", 2016);
        setShortField(term379040, term379040.getClass(), "month", (short) 6);
        setShortField(term379040, term379040.getClass(), "day", (short) 26);
        setField(term379039, term379039.getClass(), "date", term379040);
        setByteField(term379044, term379044.getClass(), "hour", (byte) 9);
        setByteField(term379044, term379044.getClass(), "minute", (byte) 29);
        setByteField(term379044, term379044.getClass(), "second", (byte) 7);
        setIntField(term379044, term379044.getClass(), "nano", 221304313);
        setField(term379039, term379039.getClass(), "time", term379044);
        setField(term379023, term379023.getClass(), "registerTime", term379039);
        setIntField(term379050, term379050.getClass(), "year", 2029);
        setShortField(term379050, term379050.getClass(), "month", (short) 2);
        setShortField(term379050, term379050.getClass(), "day", (short) 27);
        setField(term379049, term379049.getClass(), "date", term379050);
        setByteField(term379054, term379054.getClass(), "hour", (byte) 21);
        setByteField(term379054, term379054.getClass(), "minute", (byte) 20);
        setByteField(term379054, term379054.getClass(), "second", (byte) 0);
        setIntField(term379054, term379054.getClass(), "nano", 39602134);
        setField(term379049, term379049.getClass(), "time", term379054);
        setField(term379023, term379023.getClass(), "accessTime", term379049);
        setField(term379021, term379021.getClass(), "card", term379023);
        setField(term379021, term379021.getClass(), "userName", "riFklUwKMI");
        setIntField(term379021, term379021.getClass(), "level", -1614482762);
        setIntField(term379021, term379021.getClass(), "reincarnationNum", 1110390716);
        setLongField(term379021, term379021.getClass(), "exp", 3985404144322379409L);
        setLongField(term379021, term379021.getClass(), "point", -271284873521510767L);
        setLongField(term379021, term379021.getClass(), "totalPoint", 1559682669614542990L);
        setIntField(term379021, term379021.getClass(), "playCount", 239736147);
        setIntField(term379021, term379021.getClass(), "jewelCount", -1094472530);
        setIntField(term379021, term379021.getClass(), "totalJewelCount", 1002719416);
        setIntField(term379021, term379021.getClass(), "medalCount", -464322205);
        setIntField(term379021, term379021.getClass(), "playerRating", -2057919106);
        setIntField(term379021, term379021.getClass(), "highestRating", 1527025206);
        setIntField(term379021, term379021.getClass(), "battlePoint", 1236589731);
        setIntField(term379021, term379021.getClass(), "bestBattlePoint", -1806561644);
        setIntField(term379021, term379021.getClass(), "overDamageBattlePoint", -1396920981);
        setBooleanField(term379021, term379021.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term379021, term379021.getClass(), "nameplateId", 502273141);
        setIntField(term379021, term379021.getClass(), "trophyId", -921840156);
        setIntField(term379021, term379021.getClass(), "cardId", -1983634048);
        setIntField(term379021, term379021.getClass(), "characterId", -1800595863);
        setIntField(term379021, term379021.getClass(), "characterVoiceNo", 1953892479);
        setIntField(term379021, term379021.getClass(), "tabSetting", 63933852);
        setIntField(term379021, term379021.getClass(), "tabSortSetting", 1005260296);
        setIntField(term379021, term379021.getClass(), "cardCategorySetting", 1351041442);
        setIntField(term379021, term379021.getClass(), "cardSortSetting", 1240046991);
        setIntField(term379021, term379021.getClass(), "rivalScoreCategorySetting", -1401951049);
        setIntField(term379021, term379021.getClass(), "playedTutorialBit", -1907582918);
        setIntField(term379021, term379021.getClass(), "firstTutorialCancelNum", -805804471);
        setLongField(term379021, term379021.getClass(), "sumTechHighScore", -1598576132506484933L);
        setLongField(term379021, term379021.getClass(), "sumTechBasicHighScore", 3850056687561898536L);
        setLongField(term379021, term379021.getClass(), "sumTechAdvancedHighScore", -7688997222814934700L);
        setLongField(term379021, term379021.getClass(), "sumTechExpertHighScore", -2129187460331541891L);
        setLongField(term379021, term379021.getClass(), "sumTechMasterHighScore", -3221037216490454031L);
        setLongField(term379021, term379021.getClass(), "sumTechLunaticHighScore", -4763131820093381470L);
        setLongField(term379021, term379021.getClass(), "sumBattleHighScore", 2426875983741069269L);
        setLongField(term379021, term379021.getClass(), "sumBattleBasicHighScore", -6080270841052331357L);
        setLongField(term379021, term379021.getClass(), "sumBattleAdvancedHighScore", 5882270503757327383L);
        setLongField(term379021, term379021.getClass(), "sumBattleExpertHighScore", -5059196096675732281L);
        setLongField(term379021, term379021.getClass(), "sumBattleMasterHighScore", -730492854459506429L);
        setLongField(term379021, term379021.getClass(), "sumBattleLunaticHighScore", 7767097705456578840L);
        setField(term379021, term379021.getClass(), "eventWatchedDate", "LHduRqftkV");
        setField(term379021, term379021.getClass(), "cmEventWatchedDate", "EyYgFqhUFa");
        setField(term379021, term379021.getClass(), "firstGameId", "RNrYlNFXaw");
        setField(term379021, term379021.getClass(), "firstRomVersion", "dsHQnDBJhZ");
        setField(term379021, term379021.getClass(), "firstDataVersion", "SbEnzAKxTm");
        setField(term379021, term379021.getClass(), "firstPlayDate", "SONjsMGvSo");
        setField(term379021, term379021.getClass(), "lastGameId", "EnMLGHLwuX");
        setField(term379021, term379021.getClass(), "lastRomVersion", "SFPrRqVEYV");
        setField(term379021, term379021.getClass(), "lastDataVersion", "oXBsUtWaBr");
        setField(term379021, term379021.getClass(), "compatibleCmVersion", "WwxFSZzErk");
        setField(term379021, term379021.getClass(), "lastPlayDate", "kvbycvBtsE");
        setIntField(term379021, term379021.getClass(), "lastPlaceId", -1729149654);
        setField(term379021, term379021.getClass(), "lastPlaceName", "TKmmbUuJiS");
        setIntField(term379021, term379021.getClass(), "lastRegionId", 149296956);
        setField(term379021, term379021.getClass(), "lastRegionName", "RfBXfEtuDg");
        setIntField(term379021, term379021.getClass(), "lastAllNetId", 1778911003);
        setField(term379021, term379021.getClass(), "lastClientId", "zoqzGOxBac");
        setIntField(term379021, term379021.getClass(), "lastUsedDeckId", 1257643791);
        setIntField(term379021, term379021.getClass(), "lastPlayMusicLevel", 2133926277);
        setIntField(term379021, term379021.getClass(), "lastEmoneyBrand", -1586169626);
        setField(term379019, term379019.getClass(), "user", term379021);
        setIntField(term379019, term379019.getClass(), "eventId", 349234086);
        setIntField(term379019, term379019.getClass(), "type", -1546659110);
        setIntField(term379019, term379019.getClass(), "musicId", -1476543965);
        setIntField(term379019, term379019.getClass(), "level", -71727372);
        setIntField(term379019, term379019.getClass(), "techScoreMax", 747994133);
        setIntField(term379019, term379019.getClass(), "platinumScoreMax", 1847207096);
        setField(term379019, term379019.getClass(), "techRecordDate", "FkBwcArxXF");
        setBooleanField(term379019, term379019.getClass(), "isTechNewRecord", false);
        term379303 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserEventMusic");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term379303;
        callMethod(klass, "equals", argTypes, term379019, args);
    }

};


