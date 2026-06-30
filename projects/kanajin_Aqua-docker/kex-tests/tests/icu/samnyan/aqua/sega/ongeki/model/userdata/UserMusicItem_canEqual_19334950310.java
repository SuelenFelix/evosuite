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

public class UserMusicItem_canEqual_19334950310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4697;
     Object term4964;

    public UserMusicItem_canEqual_19334950310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4703 = new Long(-8885298608300233488L);
        term4697 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicItem"));
        Object term4699 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term4701 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4717 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4718 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4722 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4727 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4728 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4732 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4697, term4697.getClass(), "id", 9205327385733285058L);
        setLongField(term4699, term4699.getClass(), "id", 4199886998224701110L);
        setLongField(term4701, term4701.getClass(), "id", 8540994973773607992L);
        setField(term4701, term4701.getClass(), "extId", term4703);
        setField(term4701, term4701.getClass(), "luid", "lihXWlGDxk");
        setIntField(term4718, term4718.getClass(), "year", 2015);
        setShortField(term4718, term4718.getClass(), "month", (short) 3);
        setShortField(term4718, term4718.getClass(), "day", (short) 10);
        setField(term4717, term4717.getClass(), "date", term4718);
        setByteField(term4722, term4722.getClass(), "hour", (byte) 23);
        setByteField(term4722, term4722.getClass(), "minute", (byte) 34);
        setByteField(term4722, term4722.getClass(), "second", (byte) 44);
        setIntField(term4722, term4722.getClass(), "nano", 587322824);
        setField(term4717, term4717.getClass(), "time", term4722);
        setField(term4701, term4701.getClass(), "registerTime", term4717);
        setIntField(term4728, term4728.getClass(), "year", 2027);
        setShortField(term4728, term4728.getClass(), "month", (short) 8);
        setShortField(term4728, term4728.getClass(), "day", (short) 26);
        setField(term4727, term4727.getClass(), "date", term4728);
        setByteField(term4732, term4732.getClass(), "hour", (byte) 5);
        setByteField(term4732, term4732.getClass(), "minute", (byte) 11);
        setByteField(term4732, term4732.getClass(), "second", (byte) 9);
        setIntField(term4732, term4732.getClass(), "nano", 219245092);
        setField(term4727, term4727.getClass(), "time", term4732);
        setField(term4701, term4701.getClass(), "accessTime", term4727);
        setField(term4699, term4699.getClass(), "card", term4701);
        setField(term4699, term4699.getClass(), "userName", "JmcmxoGhIK");
        setIntField(term4699, term4699.getClass(), "level", -146054762);
        setIntField(term4699, term4699.getClass(), "reincarnationNum", 798043553);
        setLongField(term4699, term4699.getClass(), "exp", -2338103433822116635L);
        setLongField(term4699, term4699.getClass(), "point", -1885698929232124806L);
        setLongField(term4699, term4699.getClass(), "totalPoint", 5731563613239387113L);
        setIntField(term4699, term4699.getClass(), "playCount", 533197381);
        setIntField(term4699, term4699.getClass(), "jewelCount", 1048271679);
        setIntField(term4699, term4699.getClass(), "totalJewelCount", -1529797673);
        setIntField(term4699, term4699.getClass(), "medalCount", -868676396);
        setIntField(term4699, term4699.getClass(), "playerRating", 1922684808);
        setIntField(term4699, term4699.getClass(), "highestRating", -2005784375);
        setIntField(term4699, term4699.getClass(), "battlePoint", -288604325);
        setIntField(term4699, term4699.getClass(), "bestBattlePoint", -1268314569);
        setIntField(term4699, term4699.getClass(), "overDamageBattlePoint", 877649659);
        setBooleanField(term4699, term4699.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term4699, term4699.getClass(), "nameplateId", -1332748804);
        setIntField(term4699, term4699.getClass(), "trophyId", 1774507971);
        setIntField(term4699, term4699.getClass(), "cardId", -1420269858);
        setIntField(term4699, term4699.getClass(), "characterId", -2119545015);
        setIntField(term4699, term4699.getClass(), "characterVoiceNo", 1272542218);
        setIntField(term4699, term4699.getClass(), "tabSetting", 1209799204);
        setIntField(term4699, term4699.getClass(), "tabSortSetting", 1094107751);
        setIntField(term4699, term4699.getClass(), "cardCategorySetting", 844222656);
        setIntField(term4699, term4699.getClass(), "cardSortSetting", -18216811);
        setIntField(term4699, term4699.getClass(), "rivalScoreCategorySetting", -1813280137);
        setIntField(term4699, term4699.getClass(), "playedTutorialBit", 719656595);
        setIntField(term4699, term4699.getClass(), "firstTutorialCancelNum", -1516995753);
        setLongField(term4699, term4699.getClass(), "sumTechHighScore", 3381333711768010594L);
        setLongField(term4699, term4699.getClass(), "sumTechBasicHighScore", 3580984732036213717L);
        setLongField(term4699, term4699.getClass(), "sumTechAdvancedHighScore", 5330761990446327930L);
        setLongField(term4699, term4699.getClass(), "sumTechExpertHighScore", -3954795081650780841L);
        setLongField(term4699, term4699.getClass(), "sumTechMasterHighScore", 3288791194263207397L);
        setLongField(term4699, term4699.getClass(), "sumTechLunaticHighScore", 3288941170644426558L);
        setLongField(term4699, term4699.getClass(), "sumBattleHighScore", -8338004844694486146L);
        setLongField(term4699, term4699.getClass(), "sumBattleBasicHighScore", 6426732259596412988L);
        setLongField(term4699, term4699.getClass(), "sumBattleAdvancedHighScore", 185793058502220865L);
        setLongField(term4699, term4699.getClass(), "sumBattleExpertHighScore", -7698746988132548371L);
        setLongField(term4699, term4699.getClass(), "sumBattleMasterHighScore", 2145420811068634601L);
        setLongField(term4699, term4699.getClass(), "sumBattleLunaticHighScore", 2191130532479601175L);
        setField(term4699, term4699.getClass(), "eventWatchedDate", "jXzmYyrnnT");
        setField(term4699, term4699.getClass(), "cmEventWatchedDate", "igCAtimmYB");
        setField(term4699, term4699.getClass(), "firstGameId", "DyiXbeYIaN");
        setField(term4699, term4699.getClass(), "firstRomVersion", "VGizxZnyHX");
        setField(term4699, term4699.getClass(), "firstDataVersion", "kVEZMHmRtR");
        setField(term4699, term4699.getClass(), "firstPlayDate", "ekxGuOYIwi");
        setField(term4699, term4699.getClass(), "lastGameId", "RbVQXSpxXy");
        setField(term4699, term4699.getClass(), "lastRomVersion", "YpJbIgJWWv");
        setField(term4699, term4699.getClass(), "lastDataVersion", "JppkknKVOw");
        setField(term4699, term4699.getClass(), "compatibleCmVersion", "iljANwuEjk");
        setField(term4699, term4699.getClass(), "lastPlayDate", "kNqaJKIATy");
        setIntField(term4699, term4699.getClass(), "lastPlaceId", -390501023);
        setField(term4699, term4699.getClass(), "lastPlaceName", "vKQukfbJUd");
        setIntField(term4699, term4699.getClass(), "lastRegionId", -1667482829);
        setField(term4699, term4699.getClass(), "lastRegionName", "lFRJFUMVbx");
        setIntField(term4699, term4699.getClass(), "lastAllNetId", 1116576792);
        setField(term4699, term4699.getClass(), "lastClientId", "sZdUNdggUW");
        setIntField(term4699, term4699.getClass(), "lastUsedDeckId", -942194446);
        setIntField(term4699, term4699.getClass(), "lastPlayMusicLevel", -938508470);
        setIntField(term4699, term4699.getClass(), "lastEmoneyBrand", 1242676024);
        setField(term4697, term4697.getClass(), "user", term4699);
        setIntField(term4697, term4697.getClass(), "musicId", -1865023308);
        setIntField(term4697, term4697.getClass(), "status", 1698510819);
        term4964 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term4964;
        callMethod(klass, "canEqual", argTypes, term4697, args);
    }

};


