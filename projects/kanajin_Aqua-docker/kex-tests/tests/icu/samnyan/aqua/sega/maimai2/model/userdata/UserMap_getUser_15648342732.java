package icu.samnyan.aqua.sega.maimai2.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai2.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;
import java.util.ArrayList;
import java.lang.Integer;

public class UserMap_getUser_15648342732 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term574386;

    public UserMap_getUser_15648342732() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term574392 = new Long(-8653467709084853156L);
        Integer term574455 = new Integer(-1803247273);
        Integer term574457 = new Integer(-1755475707);
        Integer term574459 = new Integer(-1233102871);
        Integer term574461 = new Integer(-573135556);
        Integer term574463 = new Integer(995946657);
        ArrayList term574453 = new ArrayList();
        ((ArrayList) term574453).add(term574455);
        ((ArrayList) term574453).add(term574457);
        ((ArrayList) term574453).add(term574459);
        ((ArrayList) term574453).add(term574461);
        ((ArrayList) term574453).add(term574463);
        Integer term574469 = new Integer(-1689684498);
        Integer term574471 = new Integer(-1408160580);
        ArrayList term574467 = new ArrayList();
        ((ArrayList) term574467).add(term574469);
        ((ArrayList) term574467).add(term574471);
        term574386 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserMap"));
        Object term574388 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term574390 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term574406 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term574407 = newInstance(Class.forName("java.time.LocalDate"));
        Object term574411 = newInstance(Class.forName("java.time.LocalTime"));
        Object term574416 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term574417 = newInstance(Class.forName("java.time.LocalDate"));
        Object term574421 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term574386, term574386.getClass(), "id", -2254512741882161383L);
        setLongField(term574388, term574388.getClass(), "id", 6075649195681023459L);
        setLongField(term574390, term574390.getClass(), "id", -8225829668970991141L);
        setField(term574390, term574390.getClass(), "extId", term574392);
        setField(term574390, term574390.getClass(), "luid", "yCuFPckgNE");
        setIntField(term574407, term574407.getClass(), "year", 2016);
        setShortField(term574407, term574407.getClass(), "month", (short) 6);
        setShortField(term574407, term574407.getClass(), "day", (short) 26);
        setField(term574406, term574406.getClass(), "date", term574407);
        setByteField(term574411, term574411.getClass(), "hour", (byte) 8);
        setByteField(term574411, term574411.getClass(), "minute", (byte) 31);
        setByteField(term574411, term574411.getClass(), "second", (byte) 58);
        setIntField(term574411, term574411.getClass(), "nano", 22292842);
        setField(term574406, term574406.getClass(), "time", term574411);
        setField(term574390, term574390.getClass(), "registerTime", term574406);
        setIntField(term574417, term574417.getClass(), "year", 2017);
        setShortField(term574417, term574417.getClass(), "month", (short) 12);
        setShortField(term574417, term574417.getClass(), "day", (short) 10);
        setField(term574416, term574416.getClass(), "date", term574417);
        setByteField(term574421, term574421.getClass(), "hour", (byte) 0);
        setByteField(term574421, term574421.getClass(), "minute", (byte) 56);
        setByteField(term574421, term574421.getClass(), "second", (byte) 17);
        setIntField(term574421, term574421.getClass(), "nano", 381710663);
        setField(term574416, term574416.getClass(), "time", term574421);
        setField(term574390, term574390.getClass(), "accessTime", term574416);
        setField(term574388, term574388.getClass(), "card", term574390);
        setField(term574388, term574388.getClass(), "userName", "XCtcMBfzIa");
        setIntField(term574388, term574388.getClass(), "isNetMember", 1992618149);
        setIntField(term574388, term574388.getClass(), "iconId", 337003394);
        setIntField(term574388, term574388.getClass(), "plateId", -874544363);
        setIntField(term574388, term574388.getClass(), "titleId", -1656600607);
        setIntField(term574388, term574388.getClass(), "partnerId", -2115001347);
        setIntField(term574388, term574388.getClass(), "frameId", 1932571016);
        setIntField(term574388, term574388.getClass(), "selectMapId", -74234687);
        setIntField(term574388, term574388.getClass(), "totalAwake", 1327957665);
        setIntField(term574388, term574388.getClass(), "gradeRating", -17356450);
        setIntField(term574388, term574388.getClass(), "musicRating", 95108045);
        setIntField(term574388, term574388.getClass(), "playerRating", -1647830429);
        setIntField(term574388, term574388.getClass(), "highestRating", -1365996098);
        setIntField(term574388, term574388.getClass(), "gradeRank", 1647300934);
        setIntField(term574388, term574388.getClass(), "classRank", -1553920111);
        setIntField(term574388, term574388.getClass(), "courseRank", -28740654);
        setField(term574388, term574388.getClass(), "charaSlot", term574453);
        setField(term574388, term574388.getClass(), "charaLockSlot", term574467);
        setLongField(term574388, term574388.getClass(), "contentBit", -4210841655268834629L);
        setIntField(term574388, term574388.getClass(), "playCount", 380135777);
        setField(term574388, term574388.getClass(), "eventWatchedDate", "rpdaHjpeBv");
        setField(term574388, term574388.getClass(), "lastGameId", "oYwdaaVIKX");
        setField(term574388, term574388.getClass(), "lastRomVersion", "RchASaSCQH");
        setField(term574388, term574388.getClass(), "lastDataVersion", "GBNDdrYQtD");
        setField(term574388, term574388.getClass(), "lastLoginDate", "HPHXAGQZUk");
        setField(term574388, term574388.getClass(), "lastPlayDate", "ACssLekRSs");
        setIntField(term574388, term574388.getClass(), "lastPlayCredit", -996776050);
        setIntField(term574388, term574388.getClass(), "lastPlayMode", -1756773924);
        setIntField(term574388, term574388.getClass(), "lastPlaceId", -1503202243);
        setField(term574388, term574388.getClass(), "lastPlaceName", "twFhBCHcKY");
        setIntField(term574388, term574388.getClass(), "lastAllNetId", 955023084);
        setIntField(term574388, term574388.getClass(), "lastRegionId", -1984289550);
        setField(term574388, term574388.getClass(), "lastRegionName", "CluNJMvPoH");
        setField(term574388, term574388.getClass(), "lastClientId", "LAkXGEwyjw");
        setField(term574388, term574388.getClass(), "lastCountryCode", "MFGxcFcvde");
        setIntField(term574388, term574388.getClass(), "lastSelectEMoney", -1866351441);
        setIntField(term574388, term574388.getClass(), "lastSelectTicket", -287856309);
        setIntField(term574388, term574388.getClass(), "lastSelectCourse", 1808785230);
        setIntField(term574388, term574388.getClass(), "lastCountCourse", 328578256);
        setField(term574388, term574388.getClass(), "firstGameId", "SSctPGcvHH");
        setField(term574388, term574388.getClass(), "firstRomVersion", "TCPrEenVoS");
        setField(term574388, term574388.getClass(), "firstDataVersion", "dIQLPwfyKC");
        setField(term574388, term574388.getClass(), "firstPlayDate", "xhOtEelFeI");
        setField(term574388, term574388.getClass(), "compatibleCmVersion", "miQocyOJYh");
        setField(term574388, term574388.getClass(), "dailyBonusDate", "USUgxvsgvK");
        setField(term574388, term574388.getClass(), "dailyCourseBonusDate", "PawEHfNVmI");
        setField(term574388, term574388.getClass(), "lastPairLoginDate", "wqzkntpgIm");
        setField(term574388, term574388.getClass(), "lastTrialPlayDate", "HxfIYZhAyB");
        setIntField(term574388, term574388.getClass(), "playVsCount", 2060438395);
        setIntField(term574388, term574388.getClass(), "playSyncCount", 930549892);
        setIntField(term574388, term574388.getClass(), "winCount", -383128936);
        setIntField(term574388, term574388.getClass(), "helpCount", 1456231215);
        setIntField(term574388, term574388.getClass(), "comboCount", -1496155434);
        setLongField(term574388, term574388.getClass(), "totalDeluxscore", -5845645267619691742L);
        setLongField(term574388, term574388.getClass(), "totalBasicDeluxscore", -4998228858044177964L);
        setLongField(term574388, term574388.getClass(), "totalAdvancedDeluxscore", 104887894037150200L);
        setLongField(term574388, term574388.getClass(), "totalExpertDeluxscore", -5264092919886176730L);
        setLongField(term574388, term574388.getClass(), "totalMasterDeluxscore", -8974885617199036296L);
        setLongField(term574388, term574388.getClass(), "totalReMasterDeluxscore", -437961200204234236L);
        setIntField(term574388, term574388.getClass(), "totalSync", 688033518);
        setIntField(term574388, term574388.getClass(), "totalBasicSync", -2003593008);
        setIntField(term574388, term574388.getClass(), "totalAdvancedSync", 1703692034);
        setIntField(term574388, term574388.getClass(), "totalExpertSync", 393690988);
        setIntField(term574388, term574388.getClass(), "totalMasterSync", 776224507);
        setIntField(term574388, term574388.getClass(), "totalReMasterSync", 1372322821);
        setLongField(term574388, term574388.getClass(), "totalAchievement", -7817515122066448788L);
        setLongField(term574388, term574388.getClass(), "totalBasicAchievement", -5576916409996403619L);
        setLongField(term574388, term574388.getClass(), "totalAdvancedAchievement", 1137205658638658103L);
        setLongField(term574388, term574388.getClass(), "totalExpertAchievement", 5663026168674305598L);
        setLongField(term574388, term574388.getClass(), "totalMasterAchievement", -7309658665917168651L);
        setLongField(term574388, term574388.getClass(), "totalReMasterAchievement", 6317122673829149850L);
        setLongField(term574388, term574388.getClass(), "playerOldRating", 5898022083745212128L);
        setLongField(term574388, term574388.getClass(), "playerNewRating", 2252188711598363213L);
        setIntField(term574388, term574388.getClass(), "banState", 1403534510);
        setLongField(term574388, term574388.getClass(), "dateTime", 7316443226799414517L);
        setField(term574386, term574386.getClass(), "user", term574388);
        setIntField(term574386, term574386.getClass(), "mapId", 1351129139);
        setIntField(term574386, term574386.getClass(), "distance", -1048430430);
        setBooleanField(term574386, term574386.getClass(), "isLock", false);
        setBooleanField(term574386, term574386.getClass(), "isClear", true);
        setBooleanField(term574386, term574386.getClass(), "isComplete", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserMap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUser", argTypes, term574386, args);
    }

};


