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

public class UserFriendSeasonRanking_equals_49285404617 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25682;
     Object term26069;

    public UserFriendSeasonRanking_equals_49285404617() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term25688 = new Long(-6645965768855543712L);
        ArrayList term25749 = new ArrayList();
        Integer term25755 = new Integer(768407648);
        Integer term25757 = new Integer(-350454594);
        Integer term25759 = new Integer(-1148142995);
        Integer term25761 = new Integer(-233024044);
        Integer term25763 = new Integer(1820784228);
        Integer term25765 = new Integer(1390820006);
        Integer term25767 = new Integer(-828982065);
        Integer term25769 = new Integer(1221443226);
        Integer term25771 = new Integer(908108726);
        ArrayList term25753 = new ArrayList();
        ((ArrayList) term25753).add(term25755);
        ((ArrayList) term25753).add(term25757);
        ((ArrayList) term25753).add(term25759);
        ((ArrayList) term25753).add(term25761);
        ((ArrayList) term25753).add(term25763);
        ((ArrayList) term25753).add(term25765);
        ((ArrayList) term25753).add(term25767);
        ((ArrayList) term25753).add(term25769);
        ((ArrayList) term25753).add(term25771);
        term25682 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserFriendSeasonRanking"));
        Object term25684 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term25686 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term25702 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term25703 = newInstance(Class.forName("java.time.LocalDate"));
        Object term25707 = newInstance(Class.forName("java.time.LocalTime"));
        Object term25712 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term25713 = newInstance(Class.forName("java.time.LocalDate"));
        Object term25717 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term25682, term25682.getClass(), "id", -1721083210597101555L);
        setLongField(term25684, term25684.getClass(), "id", 937792282597213200L);
        setLongField(term25686, term25686.getClass(), "id", -6096027338784768449L);
        setField(term25686, term25686.getClass(), "extId", term25688);
        setField(term25686, term25686.getClass(), "luid", "HejzvyejjG");
        setIntField(term25703, term25703.getClass(), "year", 2025);
        setShortField(term25703, term25703.getClass(), "month", (short) 12);
        setShortField(term25703, term25703.getClass(), "day", (short) 16);
        setField(term25702, term25702.getClass(), "date", term25703);
        setByteField(term25707, term25707.getClass(), "hour", (byte) 7);
        setByteField(term25707, term25707.getClass(), "minute", (byte) 53);
        setByteField(term25707, term25707.getClass(), "second", (byte) 23);
        setIntField(term25707, term25707.getClass(), "nano", 532991944);
        setField(term25702, term25702.getClass(), "time", term25707);
        setField(term25686, term25686.getClass(), "registerTime", term25702);
        setIntField(term25713, term25713.getClass(), "year", 2024);
        setShortField(term25713, term25713.getClass(), "month", (short) 2);
        setShortField(term25713, term25713.getClass(), "day", (short) 5);
        setField(term25712, term25712.getClass(), "date", term25713);
        setByteField(term25717, term25717.getClass(), "hour", (byte) 12);
        setByteField(term25717, term25717.getClass(), "minute", (byte) 28);
        setByteField(term25717, term25717.getClass(), "second", (byte) 37);
        setIntField(term25717, term25717.getClass(), "nano", 689695229);
        setField(term25712, term25712.getClass(), "time", term25717);
        setField(term25686, term25686.getClass(), "accessTime", term25712);
        setField(term25684, term25684.getClass(), "card", term25686);
        setField(term25684, term25684.getClass(), "userName", "pbqJjeooBM");
        setIntField(term25684, term25684.getClass(), "isNetMember", -1111307978);
        setIntField(term25684, term25684.getClass(), "iconId", 609697271);
        setIntField(term25684, term25684.getClass(), "plateId", 1121247998);
        setIntField(term25684, term25684.getClass(), "titleId", -710001354);
        setIntField(term25684, term25684.getClass(), "partnerId", 2007404429);
        setIntField(term25684, term25684.getClass(), "frameId", 472580433);
        setIntField(term25684, term25684.getClass(), "selectMapId", 1189049164);
        setIntField(term25684, term25684.getClass(), "totalAwake", -673413879);
        setIntField(term25684, term25684.getClass(), "gradeRating", 1609778442);
        setIntField(term25684, term25684.getClass(), "musicRating", 524850421);
        setIntField(term25684, term25684.getClass(), "playerRating", -1833121756);
        setIntField(term25684, term25684.getClass(), "highestRating", -1493632787);
        setIntField(term25684, term25684.getClass(), "gradeRank", -1056969264);
        setIntField(term25684, term25684.getClass(), "classRank", -709130701);
        setIntField(term25684, term25684.getClass(), "courseRank", 86144663);
        setField(term25684, term25684.getClass(), "charaSlot", term25749);
        setField(term25684, term25684.getClass(), "charaLockSlot", term25753);
        setLongField(term25684, term25684.getClass(), "contentBit", 6338971839666144092L);
        setIntField(term25684, term25684.getClass(), "playCount", -1480903995);
        setField(term25684, term25684.getClass(), "eventWatchedDate", "ccnotFfPXt");
        setField(term25684, term25684.getClass(), "lastGameId", "plWlgdgIhn");
        setField(term25684, term25684.getClass(), "lastRomVersion", "RZaKVKWtND");
        setField(term25684, term25684.getClass(), "lastDataVersion", "vXiaNiquft");
        setField(term25684, term25684.getClass(), "lastLoginDate", "lucCeiVnYe");
        setField(term25684, term25684.getClass(), "lastPlayDate", "iYwkCLMsbJ");
        setIntField(term25684, term25684.getClass(), "lastPlayCredit", -2111772603);
        setIntField(term25684, term25684.getClass(), "lastPlayMode", 637942911);
        setIntField(term25684, term25684.getClass(), "lastPlaceId", -395396657);
        setField(term25684, term25684.getClass(), "lastPlaceName", "MXLsVQWrwc");
        setIntField(term25684, term25684.getClass(), "lastAllNetId", 1677171453);
        setIntField(term25684, term25684.getClass(), "lastRegionId", -2108979704);
        setField(term25684, term25684.getClass(), "lastRegionName", "lRaSlqzqNY");
        setField(term25684, term25684.getClass(), "lastClientId", "TiEyxWXsra");
        setField(term25684, term25684.getClass(), "lastCountryCode", "TuLgwTZsPP");
        setIntField(term25684, term25684.getClass(), "lastSelectEMoney", 1629835601);
        setIntField(term25684, term25684.getClass(), "lastSelectTicket", 1866184476);
        setIntField(term25684, term25684.getClass(), "lastSelectCourse", -17998574);
        setIntField(term25684, term25684.getClass(), "lastCountCourse", 145080354);
        setField(term25684, term25684.getClass(), "firstGameId", "KoasxTJGpx");
        setField(term25684, term25684.getClass(), "firstRomVersion", "ceGeARYMoa");
        setField(term25684, term25684.getClass(), "firstDataVersion", "fFWllaiFvh");
        setField(term25684, term25684.getClass(), "firstPlayDate", "PFTdEDSbvZ");
        setField(term25684, term25684.getClass(), "compatibleCmVersion", "TbiwoiebNe");
        setField(term25684, term25684.getClass(), "dailyBonusDate", "laTITSWZuc");
        setField(term25684, term25684.getClass(), "dailyCourseBonusDate", "fkzRpxlAqS");
        setField(term25684, term25684.getClass(), "lastPairLoginDate", "VYvbTGKslj");
        setField(term25684, term25684.getClass(), "lastTrialPlayDate", "owLqDDnwZA");
        setIntField(term25684, term25684.getClass(), "playVsCount", -2087321012);
        setIntField(term25684, term25684.getClass(), "playSyncCount", -1613074612);
        setIntField(term25684, term25684.getClass(), "winCount", 1054908502);
        setIntField(term25684, term25684.getClass(), "helpCount", -1226802566);
        setIntField(term25684, term25684.getClass(), "comboCount", 1162813858);
        setLongField(term25684, term25684.getClass(), "totalDeluxscore", 5295517562699482299L);
        setLongField(term25684, term25684.getClass(), "totalBasicDeluxscore", -7671399023433976259L);
        setLongField(term25684, term25684.getClass(), "totalAdvancedDeluxscore", -8653467709084853156L);
        setLongField(term25684, term25684.getClass(), "totalExpertDeluxscore", 6135782592145916721L);
        setLongField(term25684, term25684.getClass(), "totalMasterDeluxscore", 7930227263182470549L);
        setLongField(term25684, term25684.getClass(), "totalReMasterDeluxscore", -2571841019708046378L);
        setIntField(term25684, term25684.getClass(), "totalSync", 494596414);
        setIntField(term25684, term25684.getClass(), "totalBasicSync", 1226377461);
        setIntField(term25684, term25684.getClass(), "totalAdvancedSync", -1540486514);
        setIntField(term25684, term25684.getClass(), "totalExpertSync", 1471031478);
        setIntField(term25684, term25684.getClass(), "totalMasterSync", -334716487);
        setIntField(term25684, term25684.getClass(), "totalReMasterSync", -1739012814);
        setLongField(term25684, term25684.getClass(), "totalAchievement", -4682102699090617454L);
        setLongField(term25684, term25684.getClass(), "totalBasicAchievement", 8018453258973130416L);
        setLongField(term25684, term25684.getClass(), "totalAdvancedAchievement", 5592372218942533021L);
        setLongField(term25684, term25684.getClass(), "totalExpertAchievement", 8423938983545919786L);
        setLongField(term25684, term25684.getClass(), "totalMasterAchievement", -6523933176535405885L);
        setLongField(term25684, term25684.getClass(), "totalReMasterAchievement", 6558561920118298074L);
        setLongField(term25684, term25684.getClass(), "playerOldRating", -6261257793045898313L);
        setLongField(term25684, term25684.getClass(), "playerNewRating", 6383832776430121737L);
        setIntField(term25684, term25684.getClass(), "banState", 1989014880);
        setLongField(term25684, term25684.getClass(), "dateTime", 3853743792832767733L);
        setField(term25682, term25682.getClass(), "user", term25684);
        setIntField(term25682, term25682.getClass(), "seasonId", -330280702);
        setIntField(term25682, term25682.getClass(), "point", -1858425735);
        setIntField(term25682, term25682.getClass(), "rank", 1818274550);
        setBooleanField(term25682, term25682.getClass(), "rewardGet", true);
        setField(term25682, term25682.getClass(), "userName", "eBcTbweeYp");
        setField(term25682, term25682.getClass(), "recordDate", "drcmjfQUDq");
        term26069 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserFriendSeasonRanking");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term26069;
        callMethod(klass, "equals", argTypes, term25682, args);
    }

};


