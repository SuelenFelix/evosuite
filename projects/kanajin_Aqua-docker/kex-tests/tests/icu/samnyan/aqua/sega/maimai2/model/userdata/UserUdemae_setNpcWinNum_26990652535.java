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

public class UserUdemae_setNpcWinNum_26990652535 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term115457;
     Object term115830;

    public UserUdemae_setNpcWinNum_26990652535() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term115463 = new Long(-8010214112439224349L);
        Integer term115526 = new Integer(-984660976);
        Integer term115528 = new Integer(-1419341969);
        ArrayList term115524 = new ArrayList();
        ((ArrayList) term115524).add(term115526);
        ((ArrayList) term115524).add(term115528);
        Integer term115534 = new Integer(-89522625);
        Integer term115536 = new Integer(1475906894);
        Integer term115538 = new Integer(-2004794532);
        Integer term115540 = new Integer(1232958763);
        Integer term115542 = new Integer(-1702132549);
        Integer term115544 = new Integer(-1786136772);
        ArrayList term115532 = new ArrayList();
        ((ArrayList) term115532).add(term115534);
        ((ArrayList) term115532).add(term115536);
        ((ArrayList) term115532).add(term115538);
        ((ArrayList) term115532).add(term115540);
        ((ArrayList) term115532).add(term115542);
        ((ArrayList) term115532).add(term115544);
        term115457 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserUdemae"));
        Object term115459 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term115461 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term115477 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term115478 = newInstance(Class.forName("java.time.LocalDate"));
        Object term115482 = newInstance(Class.forName("java.time.LocalTime"));
        Object term115487 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term115488 = newInstance(Class.forName("java.time.LocalDate"));
        Object term115492 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term115457, term115457.getClass(), "id", 70851082861556716L);
        setLongField(term115459, term115459.getClass(), "id", 1236947774784576213L);
        setLongField(term115461, term115461.getClass(), "id", 331764730754617349L);
        setField(term115461, term115461.getClass(), "extId", term115463);
        setField(term115461, term115461.getClass(), "luid", "hyXBBcBogW");
        setIntField(term115478, term115478.getClass(), "year", 2018);
        setShortField(term115478, term115478.getClass(), "month", (short) 2);
        setShortField(term115478, term115478.getClass(), "day", (short) 16);
        setField(term115477, term115477.getClass(), "date", term115478);
        setByteField(term115482, term115482.getClass(), "hour", (byte) 16);
        setByteField(term115482, term115482.getClass(), "minute", (byte) 32);
        setByteField(term115482, term115482.getClass(), "second", (byte) 46);
        setIntField(term115482, term115482.getClass(), "nano", 932915298);
        setField(term115477, term115477.getClass(), "time", term115482);
        setField(term115461, term115461.getClass(), "registerTime", term115477);
        setIntField(term115488, term115488.getClass(), "year", 2013);
        setShortField(term115488, term115488.getClass(), "month", (short) 11);
        setShortField(term115488, term115488.getClass(), "day", (short) 7);
        setField(term115487, term115487.getClass(), "date", term115488);
        setByteField(term115492, term115492.getClass(), "hour", (byte) 9);
        setByteField(term115492, term115492.getClass(), "minute", (byte) 3);
        setByteField(term115492, term115492.getClass(), "second", (byte) 32);
        setIntField(term115492, term115492.getClass(), "nano", 53548583);
        setField(term115487, term115487.getClass(), "time", term115492);
        setField(term115461, term115461.getClass(), "accessTime", term115487);
        setField(term115459, term115459.getClass(), "card", term115461);
        setField(term115459, term115459.getClass(), "userName", "ZkdrWdXgOr");
        setIntField(term115459, term115459.getClass(), "isNetMember", 1772832909);
        setIntField(term115459, term115459.getClass(), "iconId", -1791192223);
        setIntField(term115459, term115459.getClass(), "plateId", -384087961);
        setIntField(term115459, term115459.getClass(), "titleId", 2102378795);
        setIntField(term115459, term115459.getClass(), "partnerId", 180198397);
        setIntField(term115459, term115459.getClass(), "frameId", -763713763);
        setIntField(term115459, term115459.getClass(), "selectMapId", -1574668692);
        setIntField(term115459, term115459.getClass(), "totalAwake", -657503703);
        setIntField(term115459, term115459.getClass(), "gradeRating", -1456107555);
        setIntField(term115459, term115459.getClass(), "musicRating", -99536224);
        setIntField(term115459, term115459.getClass(), "playerRating", 864697708);
        setIntField(term115459, term115459.getClass(), "highestRating", -218244630);
        setIntField(term115459, term115459.getClass(), "gradeRank", -963363890);
        setIntField(term115459, term115459.getClass(), "classRank", 1294401720);
        setIntField(term115459, term115459.getClass(), "courseRank", -1605686410);
        setField(term115459, term115459.getClass(), "charaSlot", term115524);
        setField(term115459, term115459.getClass(), "charaLockSlot", term115532);
        setLongField(term115459, term115459.getClass(), "contentBit", 6122115298694402118L);
        setIntField(term115459, term115459.getClass(), "playCount", 890902750);
        setField(term115459, term115459.getClass(), "eventWatchedDate", "MaBKpYpsjS");
        setField(term115459, term115459.getClass(), "lastGameId", "kojhIAlLyo");
        setField(term115459, term115459.getClass(), "lastRomVersion", "qbdOdimzOh");
        setField(term115459, term115459.getClass(), "lastDataVersion", "DMjvFejbDc");
        setField(term115459, term115459.getClass(), "lastLoginDate", "LsszPdpMvX");
        setField(term115459, term115459.getClass(), "lastPlayDate", "YJYOluXjkb");
        setIntField(term115459, term115459.getClass(), "lastPlayCredit", 1085935180);
        setIntField(term115459, term115459.getClass(), "lastPlayMode", -1085733328);
        setIntField(term115459, term115459.getClass(), "lastPlaceId", -631444937);
        setField(term115459, term115459.getClass(), "lastPlaceName", "NRsURcfaWn");
        setIntField(term115459, term115459.getClass(), "lastAllNetId", 520481809);
        setIntField(term115459, term115459.getClass(), "lastRegionId", 590207234);
        setField(term115459, term115459.getClass(), "lastRegionName", "ykYKNlqHwA");
        setField(term115459, term115459.getClass(), "lastClientId", "CaYUiktPks");
        setField(term115459, term115459.getClass(), "lastCountryCode", "xSNRqymNqF");
        setIntField(term115459, term115459.getClass(), "lastSelectEMoney", 472783258);
        setIntField(term115459, term115459.getClass(), "lastSelectTicket", 248223082);
        setIntField(term115459, term115459.getClass(), "lastSelectCourse", 591035529);
        setIntField(term115459, term115459.getClass(), "lastCountCourse", 349687385);
        setField(term115459, term115459.getClass(), "firstGameId", "rswcpmelQS");
        setField(term115459, term115459.getClass(), "firstRomVersion", "OyCqSonMpX");
        setField(term115459, term115459.getClass(), "firstDataVersion", "iUUqZhloeC");
        setField(term115459, term115459.getClass(), "firstPlayDate", "HGSlDwqOUA");
        setField(term115459, term115459.getClass(), "compatibleCmVersion", "snPorJFlwz");
        setField(term115459, term115459.getClass(), "dailyBonusDate", "xEnedKycxs");
        setField(term115459, term115459.getClass(), "dailyCourseBonusDate", "prYsWiRHjA");
        setField(term115459, term115459.getClass(), "lastPairLoginDate", "aQbBLDuBpT");
        setField(term115459, term115459.getClass(), "lastTrialPlayDate", "lUpbmUdjAa");
        setIntField(term115459, term115459.getClass(), "playVsCount", -594025650);
        setIntField(term115459, term115459.getClass(), "playSyncCount", 483624079);
        setIntField(term115459, term115459.getClass(), "winCount", -1846882062);
        setIntField(term115459, term115459.getClass(), "helpCount", 1727415377);
        setIntField(term115459, term115459.getClass(), "comboCount", -553367118);
        setLongField(term115459, term115459.getClass(), "totalDeluxscore", -2546031325453902070L);
        setLongField(term115459, term115459.getClass(), "totalBasicDeluxscore", -7091739015429390563L);
        setLongField(term115459, term115459.getClass(), "totalAdvancedDeluxscore", 5505498556069200636L);
        setLongField(term115459, term115459.getClass(), "totalExpertDeluxscore", 8319967949998053430L);
        setLongField(term115459, term115459.getClass(), "totalMasterDeluxscore", -1540690618431069323L);
        setLongField(term115459, term115459.getClass(), "totalReMasterDeluxscore", 4149378651748540208L);
        setIntField(term115459, term115459.getClass(), "totalSync", 1734441946);
        setIntField(term115459, term115459.getClass(), "totalBasicSync", -1316758147);
        setIntField(term115459, term115459.getClass(), "totalAdvancedSync", -266645356);
        setIntField(term115459, term115459.getClass(), "totalExpertSync", -1168974406);
        setIntField(term115459, term115459.getClass(), "totalMasterSync", 649099374);
        setIntField(term115459, term115459.getClass(), "totalReMasterSync", -1673318908);
        setLongField(term115459, term115459.getClass(), "totalAchievement", 5605172167231177997L);
        setLongField(term115459, term115459.getClass(), "totalBasicAchievement", 5736786634821331574L);
        setLongField(term115459, term115459.getClass(), "totalAdvancedAchievement", -7704912290524056833L);
        setLongField(term115459, term115459.getClass(), "totalExpertAchievement", -7964141454757798019L);
        setLongField(term115459, term115459.getClass(), "totalMasterAchievement", -8108561590335594741L);
        setLongField(term115459, term115459.getClass(), "totalReMasterAchievement", -3640864148845613238L);
        setLongField(term115459, term115459.getClass(), "playerOldRating", 405446700030466973L);
        setLongField(term115459, term115459.getClass(), "playerNewRating", 6085713762800785207L);
        setIntField(term115459, term115459.getClass(), "banState", -748711480);
        setLongField(term115459, term115459.getClass(), "dateTime", 1123327822305694766L);
        setField(term115457, term115457.getClass(), "user", term115459);
        setIntField(term115457, term115457.getClass(), "rate", -1598682190);
        setIntField(term115457, term115457.getClass(), "maxRate", -1485075510);
        setIntField(term115457, term115457.getClass(), "classValue", -628388239);
        setIntField(term115457, term115457.getClass(), "maxClassValue", 971487780);
        setIntField(term115457, term115457.getClass(), "totalWinNum", 1887441979);
        setIntField(term115457, term115457.getClass(), "totalLoseNum", -1582466429);
        setIntField(term115457, term115457.getClass(), "maxWinNum", 2050053472);
        setIntField(term115457, term115457.getClass(), "maxLoseNum", -794841275);
        setIntField(term115457, term115457.getClass(), "winNum", -1965551214);
        setIntField(term115457, term115457.getClass(), "loseNum", 417272371);
        setIntField(term115457, term115457.getClass(), "npcTotalWinNum", -93440765);
        setIntField(term115457, term115457.getClass(), "npcTotalLoseNum", -1763224766);
        setIntField(term115457, term115457.getClass(), "npcMaxWinNum", -966554344);
        setIntField(term115457, term115457.getClass(), "npcMaxLoseNum", 1485859505);
        setIntField(term115457, term115457.getClass(), "npcWinNum", 1422308934);
        setIntField(term115457, term115457.getClass(), "npcLoseNum", -1843770627);
        term115830 = new Integer(-1984599794);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserUdemae");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term115830;
        callMethod(klass, "setNpcWinNum", argTypes, term115457, args);
    }

};


