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

public class UserCharacter_setId_6588951537 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term188560;
     Object term188929;

    public UserCharacter_setId_6588951537() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term188566 = new Long(6636235983121346803L);
        Integer term188629 = new Integer(1094053796);
        Integer term188631 = new Integer(-2097088884);
        Integer term188633 = new Integer(-1793718020);
        Integer term188635 = new Integer(1087957895);
        ArrayList term188627 = new ArrayList();
        ((ArrayList) term188627).add(term188629);
        ((ArrayList) term188627).add(term188631);
        ((ArrayList) term188627).add(term188633);
        ((ArrayList) term188627).add(term188635);
        Integer term188641 = new Integer(-1347788838);
        Integer term188643 = new Integer(-83628231);
        Integer term188645 = new Integer(1337550691);
        Integer term188647 = new Integer(2107385711);
        Integer term188649 = new Integer(986298442);
        Integer term188651 = new Integer(1751660702);
        Integer term188653 = new Integer(433217860);
        Integer term188655 = new Integer(495773924);
        ArrayList term188639 = new ArrayList();
        ((ArrayList) term188639).add(term188641);
        ((ArrayList) term188639).add(term188643);
        ((ArrayList) term188639).add(term188645);
        ((ArrayList) term188639).add(term188647);
        ((ArrayList) term188639).add(term188649);
        ((ArrayList) term188639).add(term188651);
        ((ArrayList) term188639).add(term188653);
        ((ArrayList) term188639).add(term188655);
        term188560 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCharacter"));
        Object term188562 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term188564 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term188580 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term188581 = newInstance(Class.forName("java.time.LocalDate"));
        Object term188585 = newInstance(Class.forName("java.time.LocalTime"));
        Object term188590 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term188591 = newInstance(Class.forName("java.time.LocalDate"));
        Object term188595 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term188560, term188560.getClass(), "id", 9169174050186427729L);
        setLongField(term188562, term188562.getClass(), "id", 531403575031340860L);
        setLongField(term188564, term188564.getClass(), "id", -8005402419576701688L);
        setField(term188564, term188564.getClass(), "extId", term188566);
        setField(term188564, term188564.getClass(), "luid", "VimZthzAjg");
        setIntField(term188581, term188581.getClass(), "year", 2024);
        setShortField(term188581, term188581.getClass(), "month", (short) 10);
        setShortField(term188581, term188581.getClass(), "day", (short) 29);
        setField(term188580, term188580.getClass(), "date", term188581);
        setByteField(term188585, term188585.getClass(), "hour", (byte) 8);
        setByteField(term188585, term188585.getClass(), "minute", (byte) 39);
        setByteField(term188585, term188585.getClass(), "second", (byte) 36);
        setIntField(term188585, term188585.getClass(), "nano", 718768967);
        setField(term188580, term188580.getClass(), "time", term188585);
        setField(term188564, term188564.getClass(), "registerTime", term188580);
        setIntField(term188591, term188591.getClass(), "year", 2010);
        setShortField(term188591, term188591.getClass(), "month", (short) 4);
        setShortField(term188591, term188591.getClass(), "day", (short) 5);
        setField(term188590, term188590.getClass(), "date", term188591);
        setByteField(term188595, term188595.getClass(), "hour", (byte) 6);
        setByteField(term188595, term188595.getClass(), "minute", (byte) 31);
        setByteField(term188595, term188595.getClass(), "second", (byte) 49);
        setIntField(term188595, term188595.getClass(), "nano", 665880484);
        setField(term188590, term188590.getClass(), "time", term188595);
        setField(term188564, term188564.getClass(), "accessTime", term188590);
        setField(term188562, term188562.getClass(), "card", term188564);
        setField(term188562, term188562.getClass(), "userName", "pjAQQPoGVc");
        setIntField(term188562, term188562.getClass(), "isNetMember", -1321843634);
        setIntField(term188562, term188562.getClass(), "iconId", 1529348485);
        setIntField(term188562, term188562.getClass(), "plateId", 391918007);
        setIntField(term188562, term188562.getClass(), "titleId", 81788522);
        setIntField(term188562, term188562.getClass(), "partnerId", -1593886817);
        setIntField(term188562, term188562.getClass(), "frameId", 1038801057);
        setIntField(term188562, term188562.getClass(), "selectMapId", -382750942);
        setIntField(term188562, term188562.getClass(), "totalAwake", 753064895);
        setIntField(term188562, term188562.getClass(), "gradeRating", -1315883617);
        setIntField(term188562, term188562.getClass(), "musicRating", 2097293687);
        setIntField(term188562, term188562.getClass(), "playerRating", -1521321707);
        setIntField(term188562, term188562.getClass(), "highestRating", 2016028680);
        setIntField(term188562, term188562.getClass(), "gradeRank", -551041121);
        setIntField(term188562, term188562.getClass(), "classRank", 762083421);
        setIntField(term188562, term188562.getClass(), "courseRank", 1147575851);
        setField(term188562, term188562.getClass(), "charaSlot", term188627);
        setField(term188562, term188562.getClass(), "charaLockSlot", term188639);
        setLongField(term188562, term188562.getClass(), "contentBit", -2417443285364775510L);
        setIntField(term188562, term188562.getClass(), "playCount", -1444871975);
        setField(term188562, term188562.getClass(), "eventWatchedDate", "EadswYFxjJ");
        setField(term188562, term188562.getClass(), "lastGameId", "VMvmHcwAPc");
        setField(term188562, term188562.getClass(), "lastRomVersion", "hTygVULtJv");
        setField(term188562, term188562.getClass(), "lastDataVersion", "WHPjgbWEQW");
        setField(term188562, term188562.getClass(), "lastLoginDate", "OXBxOEoBXG");
        setField(term188562, term188562.getClass(), "lastPlayDate", "qunJPciJWS");
        setIntField(term188562, term188562.getClass(), "lastPlayCredit", 16937693);
        setIntField(term188562, term188562.getClass(), "lastPlayMode", 449328397);
        setIntField(term188562, term188562.getClass(), "lastPlaceId", 2141163970);
        setField(term188562, term188562.getClass(), "lastPlaceName", "ucJGaAjWGS");
        setIntField(term188562, term188562.getClass(), "lastAllNetId", -1171001349);
        setIntField(term188562, term188562.getClass(), "lastRegionId", -171268418);
        setField(term188562, term188562.getClass(), "lastRegionName", "thdbTbQhSP");
        setField(term188562, term188562.getClass(), "lastClientId", "TnvDurRKCl");
        setField(term188562, term188562.getClass(), "lastCountryCode", "wKWVWhtCTC");
        setIntField(term188562, term188562.getClass(), "lastSelectEMoney", -512014955);
        setIntField(term188562, term188562.getClass(), "lastSelectTicket", 727682522);
        setIntField(term188562, term188562.getClass(), "lastSelectCourse", -948539005);
        setIntField(term188562, term188562.getClass(), "lastCountCourse", -109851814);
        setField(term188562, term188562.getClass(), "firstGameId", "KyKQStmGux");
        setField(term188562, term188562.getClass(), "firstRomVersion", "TLJEXuSRxb");
        setField(term188562, term188562.getClass(), "firstDataVersion", "JWZFPLoHkl");
        setField(term188562, term188562.getClass(), "firstPlayDate", "kWjqFgZlvD");
        setField(term188562, term188562.getClass(), "compatibleCmVersion", "MGUVOXFsPy");
        setField(term188562, term188562.getClass(), "dailyBonusDate", "RvPuKTmuhO");
        setField(term188562, term188562.getClass(), "dailyCourseBonusDate", "bRYuMVvhgr");
        setField(term188562, term188562.getClass(), "lastPairLoginDate", "NQpLpxNFZU");
        setField(term188562, term188562.getClass(), "lastTrialPlayDate", "MrOKRjSFWl");
        setIntField(term188562, term188562.getClass(), "playVsCount", -1512846192);
        setIntField(term188562, term188562.getClass(), "playSyncCount", 1915662147);
        setIntField(term188562, term188562.getClass(), "winCount", 1574061857);
        setIntField(term188562, term188562.getClass(), "helpCount", 1496265790);
        setIntField(term188562, term188562.getClass(), "comboCount", -1548575078);
        setLongField(term188562, term188562.getClass(), "totalDeluxscore", 949202874215055193L);
        setLongField(term188562, term188562.getClass(), "totalBasicDeluxscore", 1783419213507924258L);
        setLongField(term188562, term188562.getClass(), "totalAdvancedDeluxscore", -5770029271908830026L);
        setLongField(term188562, term188562.getClass(), "totalExpertDeluxscore", -2743414055159250540L);
        setLongField(term188562, term188562.getClass(), "totalMasterDeluxscore", 2480072034623900419L);
        setLongField(term188562, term188562.getClass(), "totalReMasterDeluxscore", -3021838392534799239L);
        setIntField(term188562, term188562.getClass(), "totalSync", 80031735);
        setIntField(term188562, term188562.getClass(), "totalBasicSync", -1471664971);
        setIntField(term188562, term188562.getClass(), "totalAdvancedSync", -1016726676);
        setIntField(term188562, term188562.getClass(), "totalExpertSync", 375593728);
        setIntField(term188562, term188562.getClass(), "totalMasterSync", -1684773948);
        setIntField(term188562, term188562.getClass(), "totalReMasterSync", -902905305);
        setLongField(term188562, term188562.getClass(), "totalAchievement", 5341137410137975896L);
        setLongField(term188562, term188562.getClass(), "totalBasicAchievement", -6578012856501009609L);
        setLongField(term188562, term188562.getClass(), "totalAdvancedAchievement", -629451464740461051L);
        setLongField(term188562, term188562.getClass(), "totalExpertAchievement", 733656404089314249L);
        setLongField(term188562, term188562.getClass(), "totalMasterAchievement", 1801000213877603286L);
        setLongField(term188562, term188562.getClass(), "totalReMasterAchievement", 6616955996274687903L);
        setLongField(term188562, term188562.getClass(), "playerOldRating", -3290833408389403753L);
        setLongField(term188562, term188562.getClass(), "playerNewRating", 3827140775468483778L);
        setIntField(term188562, term188562.getClass(), "banState", -800651098);
        setLongField(term188562, term188562.getClass(), "dateTime", -7886523375925893926L);
        setField(term188560, term188560.getClass(), "user", term188562);
        setIntField(term188560, term188560.getClass(), "characterId", -1572119625);
        setIntField(term188560, term188560.getClass(), "level", 248535854);
        setIntField(term188560, term188560.getClass(), "awakening", -1512718729);
        setIntField(term188560, term188560.getClass(), "useCount", -1550333717);
        term188929 = new Long(1196966682262295867L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCharacter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term188929;
        callMethod(klass, "setId", argTypes, term188560, args);
    }

};


