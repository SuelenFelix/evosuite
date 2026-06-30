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

public class UserScenario_getPlayCount_9153659074 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97825;

    public UserScenario_getPlayCount_9153659074() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term97831 = new Long(-7698746988132548371L);
        term97825 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserScenario"));
        Object term97827 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term97829 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term97845 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term97846 = newInstance(Class.forName("java.time.LocalDate"));
        Object term97850 = newInstance(Class.forName("java.time.LocalTime"));
        Object term97855 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term97856 = newInstance(Class.forName("java.time.LocalDate"));
        Object term97860 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term97825, term97825.getClass(), "id", 8013180001130062999L);
        setLongField(term97827, term97827.getClass(), "id", -7249189341298396374L);
        setLongField(term97829, term97829.getClass(), "id", 8170323121887011771L);
        setField(term97829, term97829.getClass(), "extId", term97831);
        setField(term97829, term97829.getClass(), "luid", "AVAyxUcLrK");
        setIntField(term97846, term97846.getClass(), "year", 2027);
        setShortField(term97846, term97846.getClass(), "month", (short) 3);
        setShortField(term97846, term97846.getClass(), "day", (short) 20);
        setField(term97845, term97845.getClass(), "date", term97846);
        setByteField(term97850, term97850.getClass(), "hour", (byte) 9);
        setByteField(term97850, term97850.getClass(), "minute", (byte) 34);
        setByteField(term97850, term97850.getClass(), "second", (byte) 31);
        setIntField(term97850, term97850.getClass(), "nano", 746182707);
        setField(term97845, term97845.getClass(), "time", term97850);
        setField(term97829, term97829.getClass(), "registerTime", term97845);
        setIntField(term97856, term97856.getClass(), "year", 2018);
        setShortField(term97856, term97856.getClass(), "month", (short) 9);
        setShortField(term97856, term97856.getClass(), "day", (short) 11);
        setField(term97855, term97855.getClass(), "date", term97856);
        setByteField(term97860, term97860.getClass(), "hour", (byte) 18);
        setByteField(term97860, term97860.getClass(), "minute", (byte) 44);
        setByteField(term97860, term97860.getClass(), "second", (byte) 42);
        setIntField(term97860, term97860.getClass(), "nano", 303163100);
        setField(term97855, term97855.getClass(), "time", term97860);
        setField(term97829, term97829.getClass(), "accessTime", term97855);
        setField(term97827, term97827.getClass(), "card", term97829);
        setField(term97827, term97827.getClass(), "userName", "xLwgTuAlud");
        setIntField(term97827, term97827.getClass(), "level", 1088015655);
        setIntField(term97827, term97827.getClass(), "reincarnationNum", -1328130039);
        setLongField(term97827, term97827.getClass(), "exp", 1150165300363165306L);
        setLongField(term97827, term97827.getClass(), "point", -7095519814518579268L);
        setLongField(term97827, term97827.getClass(), "totalPoint", 6840349578265523330L);
        setIntField(term97827, term97827.getClass(), "playCount", 716362214);
        setIntField(term97827, term97827.getClass(), "jewelCount", -699487881);
        setIntField(term97827, term97827.getClass(), "totalJewelCount", 562568318);
        setIntField(term97827, term97827.getClass(), "medalCount", 297158063);
        setIntField(term97827, term97827.getClass(), "playerRating", -38995653);
        setIntField(term97827, term97827.getClass(), "highestRating", -1893842770);
        setIntField(term97827, term97827.getClass(), "battlePoint", 2048873968);
        setIntField(term97827, term97827.getClass(), "bestBattlePoint", -1447906264);
        setIntField(term97827, term97827.getClass(), "overDamageBattlePoint", 1527786708);
        setBooleanField(term97827, term97827.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term97827, term97827.getClass(), "nameplateId", -360741897);
        setIntField(term97827, term97827.getClass(), "trophyId", 1762652682);
        setIntField(term97827, term97827.getClass(), "cardId", 1760408647);
        setIntField(term97827, term97827.getClass(), "characterId", -1334125536);
        setIntField(term97827, term97827.getClass(), "characterVoiceNo", -385542140);
        setIntField(term97827, term97827.getClass(), "tabSetting", -1652323059);
        setIntField(term97827, term97827.getClass(), "tabSortSetting", -1928764789);
        setIntField(term97827, term97827.getClass(), "cardCategorySetting", -673697686);
        setIntField(term97827, term97827.getClass(), "cardSortSetting", -757914190);
        setIntField(term97827, term97827.getClass(), "rivalScoreCategorySetting", 991323397);
        setIntField(term97827, term97827.getClass(), "playedTutorialBit", -791114332);
        setIntField(term97827, term97827.getClass(), "firstTutorialCancelNum", 350325506);
        setLongField(term97827, term97827.getClass(), "sumTechHighScore", -5498941518395349431L);
        setLongField(term97827, term97827.getClass(), "sumTechBasicHighScore", 1077896998632593692L);
        setLongField(term97827, term97827.getClass(), "sumTechAdvancedHighScore", -7560431579053662981L);
        setLongField(term97827, term97827.getClass(), "sumTechExpertHighScore", -2661716358705218539L);
        setLongField(term97827, term97827.getClass(), "sumTechMasterHighScore", -7527835270984650383L);
        setLongField(term97827, term97827.getClass(), "sumTechLunaticHighScore", -8146697214903197715L);
        setLongField(term97827, term97827.getClass(), "sumBattleHighScore", 1673521388331739069L);
        setLongField(term97827, term97827.getClass(), "sumBattleBasicHighScore", -7531495309331019558L);
        setLongField(term97827, term97827.getClass(), "sumBattleAdvancedHighScore", -2699593118451160322L);
        setLongField(term97827, term97827.getClass(), "sumBattleExpertHighScore", 8882961437534648338L);
        setLongField(term97827, term97827.getClass(), "sumBattleMasterHighScore", 4036743295367021645L);
        setLongField(term97827, term97827.getClass(), "sumBattleLunaticHighScore", 9002973165154424650L);
        setField(term97827, term97827.getClass(), "eventWatchedDate", "rwsyozeRfD");
        setField(term97827, term97827.getClass(), "cmEventWatchedDate", "FYBnWmfXch");
        setField(term97827, term97827.getClass(), "firstGameId", "ZCKJKntKil");
        setField(term97827, term97827.getClass(), "firstRomVersion", "fyrqWlhCEt");
        setField(term97827, term97827.getClass(), "firstDataVersion", "tFABhePKqp");
        setField(term97827, term97827.getClass(), "firstPlayDate", "FtjQbVqqqx");
        setField(term97827, term97827.getClass(), "lastGameId", "FMhmrgLOkN");
        setField(term97827, term97827.getClass(), "lastRomVersion", "UqPFsSwrTW");
        setField(term97827, term97827.getClass(), "lastDataVersion", "zwAKIxjbAz");
        setField(term97827, term97827.getClass(), "compatibleCmVersion", "RlMsoYxesz");
        setField(term97827, term97827.getClass(), "lastPlayDate", "FkuWKCInZG");
        setIntField(term97827, term97827.getClass(), "lastPlaceId", -283849179);
        setField(term97827, term97827.getClass(), "lastPlaceName", "WoRWEXpkMK");
        setIntField(term97827, term97827.getClass(), "lastRegionId", -966646503);
        setField(term97827, term97827.getClass(), "lastRegionName", "EkKMYiEKHU");
        setIntField(term97827, term97827.getClass(), "lastAllNetId", 529842485);
        setField(term97827, term97827.getClass(), "lastClientId", "gvLQDVFTIF");
        setIntField(term97827, term97827.getClass(), "lastUsedDeckId", -713215300);
        setIntField(term97827, term97827.getClass(), "lastPlayMusicLevel", -82690767);
        setIntField(term97827, term97827.getClass(), "lastEmoneyBrand", 1511625253);
        setField(term97825, term97825.getClass(), "user", term97827);
        setIntField(term97825, term97825.getClass(), "scenarioId", 2133047515);
        setIntField(term97825, term97825.getClass(), "playCount", 1448469662);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserScenario");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayCount", argTypes, term97825, args);
    }

};


