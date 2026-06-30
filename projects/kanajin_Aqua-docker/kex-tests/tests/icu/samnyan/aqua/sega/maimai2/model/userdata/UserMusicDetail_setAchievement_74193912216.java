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

public class UserMusicDetail_setAchievement_74193912216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64770;
     Object term65147;

    public UserMusicDetail_setAchievement_74193912216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term64776 = new Long(-9040825890007374809L);
        Integer term64839 = new Integer(-1374527319);
        Integer term64841 = new Integer(-1735276919);
        Integer term64843 = new Integer(-712023865);
        Integer term64845 = new Integer(613256157);
        Integer term64847 = new Integer(454242689);
        Integer term64849 = new Integer(1798354517);
        Integer term64851 = new Integer(-1495693617);
        ArrayList term64837 = new ArrayList();
        ((ArrayList) term64837).add(term64839);
        ((ArrayList) term64837).add(term64841);
        ((ArrayList) term64837).add(term64843);
        ((ArrayList) term64837).add(term64845);
        ((ArrayList) term64837).add(term64847);
        ((ArrayList) term64837).add(term64849);
        ((ArrayList) term64837).add(term64851);
        Integer term64857 = new Integer(-890538258);
        Integer term64859 = new Integer(-1085899912);
        Integer term64861 = new Integer(-1458980236);
        Integer term64863 = new Integer(890505372);
        Integer term64865 = new Integer(2044137055);
        Integer term64867 = new Integer(-1452324619);
        Integer term64869 = new Integer(-1121709274);
        ArrayList term64855 = new ArrayList();
        ((ArrayList) term64855).add(term64857);
        ((ArrayList) term64855).add(term64859);
        ((ArrayList) term64855).add(term64861);
        ((ArrayList) term64855).add(term64863);
        ((ArrayList) term64855).add(term64865);
        ((ArrayList) term64855).add(term64867);
        ((ArrayList) term64855).add(term64869);
        term64770 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserMusicDetail"));
        Object term64772 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term64774 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term64790 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term64791 = newInstance(Class.forName("java.time.LocalDate"));
        Object term64795 = newInstance(Class.forName("java.time.LocalTime"));
        Object term64800 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term64801 = newInstance(Class.forName("java.time.LocalDate"));
        Object term64805 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term64770, term64770.getClass(), "id", 1421677180758822434L);
        setLongField(term64772, term64772.getClass(), "id", 2699420536723014626L);
        setLongField(term64774, term64774.getClass(), "id", -8846138397677255464L);
        setField(term64774, term64774.getClass(), "extId", term64776);
        setField(term64774, term64774.getClass(), "luid", "pkfsHvqODq");
        setIntField(term64791, term64791.getClass(), "year", 2022);
        setShortField(term64791, term64791.getClass(), "month", (short) 8);
        setShortField(term64791, term64791.getClass(), "day", (short) 30);
        setField(term64790, term64790.getClass(), "date", term64791);
        setByteField(term64795, term64795.getClass(), "hour", (byte) 3);
        setByteField(term64795, term64795.getClass(), "minute", (byte) 13);
        setByteField(term64795, term64795.getClass(), "second", (byte) 34);
        setIntField(term64795, term64795.getClass(), "nano", 69286341);
        setField(term64790, term64790.getClass(), "time", term64795);
        setField(term64774, term64774.getClass(), "registerTime", term64790);
        setIntField(term64801, term64801.getClass(), "year", 2013);
        setShortField(term64801, term64801.getClass(), "month", (short) 5);
        setShortField(term64801, term64801.getClass(), "day", (short) 14);
        setField(term64800, term64800.getClass(), "date", term64801);
        setByteField(term64805, term64805.getClass(), "hour", (byte) 12);
        setByteField(term64805, term64805.getClass(), "minute", (byte) 8);
        setByteField(term64805, term64805.getClass(), "second", (byte) 12);
        setIntField(term64805, term64805.getClass(), "nano", 597594916);
        setField(term64800, term64800.getClass(), "time", term64805);
        setField(term64774, term64774.getClass(), "accessTime", term64800);
        setField(term64772, term64772.getClass(), "card", term64774);
        setField(term64772, term64772.getClass(), "userName", "OoRBUdwown");
        setIntField(term64772, term64772.getClass(), "isNetMember", 1341217092);
        setIntField(term64772, term64772.getClass(), "iconId", -1945365712);
        setIntField(term64772, term64772.getClass(), "plateId", -746947278);
        setIntField(term64772, term64772.getClass(), "titleId", 799648581);
        setIntField(term64772, term64772.getClass(), "partnerId", -1929592392);
        setIntField(term64772, term64772.getClass(), "frameId", -557536719);
        setIntField(term64772, term64772.getClass(), "selectMapId", -1507520585);
        setIntField(term64772, term64772.getClass(), "totalAwake", 87370597);
        setIntField(term64772, term64772.getClass(), "gradeRating", -1516708019);
        setIntField(term64772, term64772.getClass(), "musicRating", 1316108940);
        setIntField(term64772, term64772.getClass(), "playerRating", -1092328406);
        setIntField(term64772, term64772.getClass(), "highestRating", -1065662465);
        setIntField(term64772, term64772.getClass(), "gradeRank", 689033534);
        setIntField(term64772, term64772.getClass(), "classRank", -1092529867);
        setIntField(term64772, term64772.getClass(), "courseRank", -1788533025);
        setField(term64772, term64772.getClass(), "charaSlot", term64837);
        setField(term64772, term64772.getClass(), "charaLockSlot", term64855);
        setLongField(term64772, term64772.getClass(), "contentBit", -3563971116155081558L);
        setIntField(term64772, term64772.getClass(), "playCount", -1271339104);
        setField(term64772, term64772.getClass(), "eventWatchedDate", "lSidZunNtu");
        setField(term64772, term64772.getClass(), "lastGameId", "TLUhUnoanK");
        setField(term64772, term64772.getClass(), "lastRomVersion", "JXyQTIyIrU");
        setField(term64772, term64772.getClass(), "lastDataVersion", "uplmRQRGWr");
        setField(term64772, term64772.getClass(), "lastLoginDate", "ZEmNnaQFYB");
        setField(term64772, term64772.getClass(), "lastPlayDate", "FNxFpCZxLW");
        setIntField(term64772, term64772.getClass(), "lastPlayCredit", -815986276);
        setIntField(term64772, term64772.getClass(), "lastPlayMode", 1352632981);
        setIntField(term64772, term64772.getClass(), "lastPlaceId", -2076492465);
        setField(term64772, term64772.getClass(), "lastPlaceName", "sXMXSCUbRu");
        setIntField(term64772, term64772.getClass(), "lastAllNetId", -926106316);
        setIntField(term64772, term64772.getClass(), "lastRegionId", 142204732);
        setField(term64772, term64772.getClass(), "lastRegionName", "iualVLfDmL");
        setField(term64772, term64772.getClass(), "lastClientId", "bhEFtkUvDw");
        setField(term64772, term64772.getClass(), "lastCountryCode", "ZmbknwMIBa");
        setIntField(term64772, term64772.getClass(), "lastSelectEMoney", 1428877162);
        setIntField(term64772, term64772.getClass(), "lastSelectTicket", -1464784083);
        setIntField(term64772, term64772.getClass(), "lastSelectCourse", -1564128892);
        setIntField(term64772, term64772.getClass(), "lastCountCourse", -638268686);
        setField(term64772, term64772.getClass(), "firstGameId", "UiRmBTpDTp");
        setField(term64772, term64772.getClass(), "firstRomVersion", "zQtuUgUIjK");
        setField(term64772, term64772.getClass(), "firstDataVersion", "VBeGRjPsPN");
        setField(term64772, term64772.getClass(), "firstPlayDate", "pZrAdSHQIs");
        setField(term64772, term64772.getClass(), "compatibleCmVersion", "XTOiucaEva");
        setField(term64772, term64772.getClass(), "dailyBonusDate", "JMekRNxFMU");
        setField(term64772, term64772.getClass(), "dailyCourseBonusDate", "LBNEEquiet");
        setField(term64772, term64772.getClass(), "lastPairLoginDate", "cBMdxJirJj");
        setField(term64772, term64772.getClass(), "lastTrialPlayDate", "kVnxgkemHF");
        setIntField(term64772, term64772.getClass(), "playVsCount", 213892075);
        setIntField(term64772, term64772.getClass(), "playSyncCount", 1635792054);
        setIntField(term64772, term64772.getClass(), "winCount", -2087784193);
        setIntField(term64772, term64772.getClass(), "helpCount", -112933890);
        setIntField(term64772, term64772.getClass(), "comboCount", -1810303698);
        setLongField(term64772, term64772.getClass(), "totalDeluxscore", -3838500537611270485L);
        setLongField(term64772, term64772.getClass(), "totalBasicDeluxscore", 7524709905774533651L);
        setLongField(term64772, term64772.getClass(), "totalAdvancedDeluxscore", -872902981503394121L);
        setLongField(term64772, term64772.getClass(), "totalExpertDeluxscore", 560784718707260252L);
        setLongField(term64772, term64772.getClass(), "totalMasterDeluxscore", -3516575907450439911L);
        setLongField(term64772, term64772.getClass(), "totalReMasterDeluxscore", -888272683506995872L);
        setIntField(term64772, term64772.getClass(), "totalSync", 3658317);
        setIntField(term64772, term64772.getClass(), "totalBasicSync", -1463342660);
        setIntField(term64772, term64772.getClass(), "totalAdvancedSync", 20803526);
        setIntField(term64772, term64772.getClass(), "totalExpertSync", 1322938574);
        setIntField(term64772, term64772.getClass(), "totalMasterSync", -1636808378);
        setIntField(term64772, term64772.getClass(), "totalReMasterSync", 1132856767);
        setLongField(term64772, term64772.getClass(), "totalAchievement", -4435966730765688655L);
        setLongField(term64772, term64772.getClass(), "totalBasicAchievement", -6124911442117089800L);
        setLongField(term64772, term64772.getClass(), "totalAdvancedAchievement", 6546757320645808936L);
        setLongField(term64772, term64772.getClass(), "totalExpertAchievement", 2295698553856643996L);
        setLongField(term64772, term64772.getClass(), "totalMasterAchievement", 7308834671443110196L);
        setLongField(term64772, term64772.getClass(), "totalReMasterAchievement", 8524310798833172304L);
        setLongField(term64772, term64772.getClass(), "playerOldRating", -5865325072540492518L);
        setLongField(term64772, term64772.getClass(), "playerNewRating", 6575839504960308925L);
        setIntField(term64772, term64772.getClass(), "banState", 1028135109);
        setLongField(term64772, term64772.getClass(), "dateTime", 3973872355126462836L);
        setField(term64770, term64770.getClass(), "user", term64772);
        setIntField(term64770, term64770.getClass(), "musicId", -576638264);
        setIntField(term64770, term64770.getClass(), "level", -582124031);
        setIntField(term64770, term64770.getClass(), "playCount", -1908433542);
        setIntField(term64770, term64770.getClass(), "achievement", 700489923);
        setIntField(term64770, term64770.getClass(), "comboStatus", -1490991707);
        setIntField(term64770, term64770.getClass(), "syncStatus", -1869327557);
        setIntField(term64770, term64770.getClass(), "deluxscoreMax", -1846337897);
        setIntField(term64770, term64770.getClass(), "scoreRank", 1156768326);
        term65147 = new Integer(-393842466);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term65147;
        callMethod(klass, "setAchievement", argTypes, term64770, args);
    }

};


