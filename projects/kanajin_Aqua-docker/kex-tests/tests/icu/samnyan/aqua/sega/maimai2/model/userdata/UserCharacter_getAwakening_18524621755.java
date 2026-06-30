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

public class UserCharacter_getAwakening_18524621755 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term187412;

    public UserCharacter_getAwakening_18524621755() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term187418 = new Long(4742108233936970770L);
        Integer term187481 = new Integer(-1615367460);
        Integer term187483 = new Integer(1119103227);
        Integer term187485 = new Integer(1061904558);
        Integer term187487 = new Integer(-390418218);
        Integer term187489 = new Integer(72302997);
        Integer term187491 = new Integer(1619477832);
        Integer term187493 = new Integer(611208497);
        Integer term187495 = new Integer(1184968868);
        ArrayList term187479 = new ArrayList();
        ((ArrayList) term187479).add(term187481);
        ((ArrayList) term187479).add(term187483);
        ((ArrayList) term187479).add(term187485);
        ((ArrayList) term187479).add(term187487);
        ((ArrayList) term187479).add(term187489);
        ((ArrayList) term187479).add(term187491);
        ((ArrayList) term187479).add(term187493);
        ((ArrayList) term187479).add(term187495);
        Integer term187501 = new Integer(-882725204);
        Integer term187503 = new Integer(912627382);
        Integer term187505 = new Integer(-761296444);
        Integer term187507 = new Integer(-189523711);
        Integer term187509 = new Integer(1697321852);
        Integer term187511 = new Integer(2107931912);
        Integer term187513 = new Integer(198562318);
        ArrayList term187499 = new ArrayList();
        ((ArrayList) term187499).add(term187501);
        ((ArrayList) term187499).add(term187503);
        ((ArrayList) term187499).add(term187505);
        ((ArrayList) term187499).add(term187507);
        ((ArrayList) term187499).add(term187509);
        ((ArrayList) term187499).add(term187511);
        ((ArrayList) term187499).add(term187513);
        term187412 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCharacter"));
        Object term187414 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term187416 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term187432 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term187433 = newInstance(Class.forName("java.time.LocalDate"));
        Object term187437 = newInstance(Class.forName("java.time.LocalTime"));
        Object term187442 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term187443 = newInstance(Class.forName("java.time.LocalDate"));
        Object term187447 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term187412, term187412.getClass(), "id", -1038048723599808380L);
        setLongField(term187414, term187414.getClass(), "id", -6108873462314179567L);
        setLongField(term187416, term187416.getClass(), "id", -5335397754732723832L);
        setField(term187416, term187416.getClass(), "extId", term187418);
        setField(term187416, term187416.getClass(), "luid", "iaYOIMpvRZ");
        setIntField(term187433, term187433.getClass(), "year", 2020);
        setShortField(term187433, term187433.getClass(), "month", (short) 8);
        setShortField(term187433, term187433.getClass(), "day", (short) 5);
        setField(term187432, term187432.getClass(), "date", term187433);
        setByteField(term187437, term187437.getClass(), "hour", (byte) 12);
        setByteField(term187437, term187437.getClass(), "minute", (byte) 1);
        setByteField(term187437, term187437.getClass(), "second", (byte) 26);
        setIntField(term187437, term187437.getClass(), "nano", 71456472);
        setField(term187432, term187432.getClass(), "time", term187437);
        setField(term187416, term187416.getClass(), "registerTime", term187432);
        setIntField(term187443, term187443.getClass(), "year", 2011);
        setShortField(term187443, term187443.getClass(), "month", (short) 11);
        setShortField(term187443, term187443.getClass(), "day", (short) 10);
        setField(term187442, term187442.getClass(), "date", term187443);
        setByteField(term187447, term187447.getClass(), "hour", (byte) 6);
        setByteField(term187447, term187447.getClass(), "minute", (byte) 13);
        setByteField(term187447, term187447.getClass(), "second", (byte) 21);
        setIntField(term187447, term187447.getClass(), "nano", 381837054);
        setField(term187442, term187442.getClass(), "time", term187447);
        setField(term187416, term187416.getClass(), "accessTime", term187442);
        setField(term187414, term187414.getClass(), "card", term187416);
        setField(term187414, term187414.getClass(), "userName", "sTmWbdFIlX");
        setIntField(term187414, term187414.getClass(), "isNetMember", -1583419177);
        setIntField(term187414, term187414.getClass(), "iconId", 1961030764);
        setIntField(term187414, term187414.getClass(), "plateId", 523495110);
        setIntField(term187414, term187414.getClass(), "titleId", 600476089);
        setIntField(term187414, term187414.getClass(), "partnerId", -1449298992);
        setIntField(term187414, term187414.getClass(), "frameId", -703663587);
        setIntField(term187414, term187414.getClass(), "selectMapId", 2081392977);
        setIntField(term187414, term187414.getClass(), "totalAwake", 671407930);
        setIntField(term187414, term187414.getClass(), "gradeRating", -758107101);
        setIntField(term187414, term187414.getClass(), "musicRating", -555009086);
        setIntField(term187414, term187414.getClass(), "playerRating", -1874643641);
        setIntField(term187414, term187414.getClass(), "highestRating", -228827613);
        setIntField(term187414, term187414.getClass(), "gradeRank", -912383879);
        setIntField(term187414, term187414.getClass(), "classRank", 419612893);
        setIntField(term187414, term187414.getClass(), "courseRank", -1688808288);
        setField(term187414, term187414.getClass(), "charaSlot", term187479);
        setField(term187414, term187414.getClass(), "charaLockSlot", term187499);
        setLongField(term187414, term187414.getClass(), "contentBit", 5998977952560464623L);
        setIntField(term187414, term187414.getClass(), "playCount", 1315643953);
        setField(term187414, term187414.getClass(), "eventWatchedDate", "wAunlbFkbk");
        setField(term187414, term187414.getClass(), "lastGameId", "MphslRDPYz");
        setField(term187414, term187414.getClass(), "lastRomVersion", "RIZmTXYeSJ");
        setField(term187414, term187414.getClass(), "lastDataVersion", "oNrGulyKDD");
        setField(term187414, term187414.getClass(), "lastLoginDate", "LsZMMPfJyo");
        setField(term187414, term187414.getClass(), "lastPlayDate", "DIjPJLZkuN");
        setIntField(term187414, term187414.getClass(), "lastPlayCredit", -169654203);
        setIntField(term187414, term187414.getClass(), "lastPlayMode", 1943787075);
        setIntField(term187414, term187414.getClass(), "lastPlaceId", -1518545816);
        setField(term187414, term187414.getClass(), "lastPlaceName", "mFGvDIAaPV");
        setIntField(term187414, term187414.getClass(), "lastAllNetId", -871898637);
        setIntField(term187414, term187414.getClass(), "lastRegionId", -324898193);
        setField(term187414, term187414.getClass(), "lastRegionName", "tSBiNpJBCG");
        setField(term187414, term187414.getClass(), "lastClientId", "NoJsnVjWEQ");
        setField(term187414, term187414.getClass(), "lastCountryCode", "ZgJlwtRyss");
        setIntField(term187414, term187414.getClass(), "lastSelectEMoney", 1377591788);
        setIntField(term187414, term187414.getClass(), "lastSelectTicket", -557099510);
        setIntField(term187414, term187414.getClass(), "lastSelectCourse", 261292224);
        setIntField(term187414, term187414.getClass(), "lastCountCourse", 65468982);
        setField(term187414, term187414.getClass(), "firstGameId", "jaUSNGgyPJ");
        setField(term187414, term187414.getClass(), "firstRomVersion", "XxDHAdmCbo");
        setField(term187414, term187414.getClass(), "firstDataVersion", "HoItLNtiRa");
        setField(term187414, term187414.getClass(), "firstPlayDate", "yVwIDSErFo");
        setField(term187414, term187414.getClass(), "compatibleCmVersion", "qChIJomfix");
        setField(term187414, term187414.getClass(), "dailyBonusDate", "GPbvtEgxWl");
        setField(term187414, term187414.getClass(), "dailyCourseBonusDate", "KleXGbqLCZ");
        setField(term187414, term187414.getClass(), "lastPairLoginDate", "lHPixZLDIw");
        setField(term187414, term187414.getClass(), "lastTrialPlayDate", "VgDpsGWncx");
        setIntField(term187414, term187414.getClass(), "playVsCount", -950398966);
        setIntField(term187414, term187414.getClass(), "playSyncCount", 1057009872);
        setIntField(term187414, term187414.getClass(), "winCount", 1118718954);
        setIntField(term187414, term187414.getClass(), "helpCount", -387115439);
        setIntField(term187414, term187414.getClass(), "comboCount", -2074423972);
        setLongField(term187414, term187414.getClass(), "totalDeluxscore", -7766913315400720289L);
        setLongField(term187414, term187414.getClass(), "totalBasicDeluxscore", 5173208621189388272L);
        setLongField(term187414, term187414.getClass(), "totalAdvancedDeluxscore", 7541782583121013535L);
        setLongField(term187414, term187414.getClass(), "totalExpertDeluxscore", 5693574275981501304L);
        setLongField(term187414, term187414.getClass(), "totalMasterDeluxscore", 2300641371993155L);
        setLongField(term187414, term187414.getClass(), "totalReMasterDeluxscore", -1089622132321417847L);
        setIntField(term187414, term187414.getClass(), "totalSync", -1404041303);
        setIntField(term187414, term187414.getClass(), "totalBasicSync", 1888933683);
        setIntField(term187414, term187414.getClass(), "totalAdvancedSync", -2124091816);
        setIntField(term187414, term187414.getClass(), "totalExpertSync", 1980547779);
        setIntField(term187414, term187414.getClass(), "totalMasterSync", 1413150509);
        setIntField(term187414, term187414.getClass(), "totalReMasterSync", -790909825);
        setLongField(term187414, term187414.getClass(), "totalAchievement", -3177997931491887954L);
        setLongField(term187414, term187414.getClass(), "totalBasicAchievement", -180416108590927510L);
        setLongField(term187414, term187414.getClass(), "totalAdvancedAchievement", -5591666700101099024L);
        setLongField(term187414, term187414.getClass(), "totalExpertAchievement", 5802126062780266371L);
        setLongField(term187414, term187414.getClass(), "totalMasterAchievement", 8916610383825200327L);
        setLongField(term187414, term187414.getClass(), "totalReMasterAchievement", -3797656198625801846L);
        setLongField(term187414, term187414.getClass(), "playerOldRating", 2193982667821200359L);
        setLongField(term187414, term187414.getClass(), "playerNewRating", -4225168292049445660L);
        setIntField(term187414, term187414.getClass(), "banState", -284745118);
        setLongField(term187414, term187414.getClass(), "dateTime", 6662557842491889405L);
        setField(term187412, term187412.getClass(), "user", term187414);
        setIntField(term187412, term187412.getClass(), "characterId", 13725205);
        setIntField(term187412, term187412.getClass(), "level", 508141534);
        setIntField(term187412, term187412.getClass(), "awakening", 1738752715);
        setIntField(term187412, term187412.getClass(), "useCount", 1995942126);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCharacter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAwakening", argTypes, term187412, args);
    }

};


