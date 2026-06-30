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
import java.util.LinkedList;

public class UserFavorite_setItemIdList_140368969310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term569669;
     Object term570038;

    public UserFavorite_setItemIdList_140368969310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term569675 = new Long(-3092537062189928451L);
        Integer term569738 = new Integer(-198148044);
        Integer term569740 = new Integer(1022014258);
        ArrayList term569736 = new ArrayList();
        ((ArrayList) term569736).add(term569738);
        ((ArrayList) term569736).add(term569740);
        Integer term569746 = new Integer(-125889150);
        Integer term569748 = new Integer(1022350206);
        Integer term569750 = new Integer(-171751232);
        Integer term569752 = new Integer(-999681370);
        Integer term569754 = new Integer(1143545597);
        Integer term569756 = new Integer(1949354764);
        ArrayList term569744 = new ArrayList();
        ((ArrayList) term569744).add(term569746);
        ((ArrayList) term569744).add(term569748);
        ((ArrayList) term569744).add(term569750);
        ((ArrayList) term569744).add(term569752);
        ((ArrayList) term569744).add(term569754);
        ((ArrayList) term569744).add(term569756);
        Integer term570030 = new Integer(-1317200481);
        Integer term570032 = new Integer(-229302209);
        Integer term570034 = new Integer(-1214413475);
        ArrayList term570028 = new ArrayList();
        ((ArrayList) term570028).add(term570030);
        ((ArrayList) term570028).add(term570032);
        ((ArrayList) term570028).add(term570034);
        term569669 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserFavorite"));
        Object term569671 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term569673 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term569689 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term569690 = newInstance(Class.forName("java.time.LocalDate"));
        Object term569694 = newInstance(Class.forName("java.time.LocalTime"));
        Object term569699 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term569700 = newInstance(Class.forName("java.time.LocalDate"));
        Object term569704 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term569669, term569669.getClass(), "id", 5599094476061277311L);
        setLongField(term569671, term569671.getClass(), "id", 5103079221015322457L);
        setLongField(term569673, term569673.getClass(), "id", 5688686943864989079L);
        setField(term569673, term569673.getClass(), "extId", term569675);
        setField(term569673, term569673.getClass(), "luid", "OVnMdsQdRo");
        setIntField(term569690, term569690.getClass(), "year", 2024);
        setShortField(term569690, term569690.getClass(), "month", (short) 4);
        setShortField(term569690, term569690.getClass(), "day", (short) 9);
        setField(term569689, term569689.getClass(), "date", term569690);
        setByteField(term569694, term569694.getClass(), "hour", (byte) 0);
        setByteField(term569694, term569694.getClass(), "minute", (byte) 48);
        setByteField(term569694, term569694.getClass(), "second", (byte) 32);
        setIntField(term569694, term569694.getClass(), "nano", 320317914);
        setField(term569689, term569689.getClass(), "time", term569694);
        setField(term569673, term569673.getClass(), "registerTime", term569689);
        setIntField(term569700, term569700.getClass(), "year", 2010);
        setShortField(term569700, term569700.getClass(), "month", (short) 1);
        setShortField(term569700, term569700.getClass(), "day", (short) 23);
        setField(term569699, term569699.getClass(), "date", term569700);
        setByteField(term569704, term569704.getClass(), "hour", (byte) 17);
        setByteField(term569704, term569704.getClass(), "minute", (byte) 14);
        setByteField(term569704, term569704.getClass(), "second", (byte) 3);
        setIntField(term569704, term569704.getClass(), "nano", 196125620);
        setField(term569699, term569699.getClass(), "time", term569704);
        setField(term569673, term569673.getClass(), "accessTime", term569699);
        setField(term569671, term569671.getClass(), "card", term569673);
        setField(term569671, term569671.getClass(), "userName", "uZsOTgsqix");
        setIntField(term569671, term569671.getClass(), "isNetMember", -1356615349);
        setIntField(term569671, term569671.getClass(), "iconId", -606286895);
        setIntField(term569671, term569671.getClass(), "plateId", -1853038248);
        setIntField(term569671, term569671.getClass(), "titleId", -353709136);
        setIntField(term569671, term569671.getClass(), "partnerId", 1202845789);
        setIntField(term569671, term569671.getClass(), "frameId", 536481315);
        setIntField(term569671, term569671.getClass(), "selectMapId", 1759337947);
        setIntField(term569671, term569671.getClass(), "totalAwake", 1484125822);
        setIntField(term569671, term569671.getClass(), "gradeRating", -670995710);
        setIntField(term569671, term569671.getClass(), "musicRating", -821718921);
        setIntField(term569671, term569671.getClass(), "playerRating", 1559564079);
        setIntField(term569671, term569671.getClass(), "highestRating", 251803059);
        setIntField(term569671, term569671.getClass(), "gradeRank", 249300493);
        setIntField(term569671, term569671.getClass(), "classRank", -232440256);
        setIntField(term569671, term569671.getClass(), "courseRank", -1333893623);
        setField(term569671, term569671.getClass(), "charaSlot", term569736);
        setField(term569671, term569671.getClass(), "charaLockSlot", term569744);
        setLongField(term569671, term569671.getClass(), "contentBit", 5760246725222312158L);
        setIntField(term569671, term569671.getClass(), "playCount", 1394805139);
        setField(term569671, term569671.getClass(), "eventWatchedDate", "CRCzaOfSPF");
        setField(term569671, term569671.getClass(), "lastGameId", "yijaLVysiY");
        setField(term569671, term569671.getClass(), "lastRomVersion", "xOTOVsjNCf");
        setField(term569671, term569671.getClass(), "lastDataVersion", "JLymVKOkwq");
        setField(term569671, term569671.getClass(), "lastLoginDate", "hIZrvMcqCX");
        setField(term569671, term569671.getClass(), "lastPlayDate", "qjNCFJuoSH");
        setIntField(term569671, term569671.getClass(), "lastPlayCredit", -1281453570);
        setIntField(term569671, term569671.getClass(), "lastPlayMode", 1313307845);
        setIntField(term569671, term569671.getClass(), "lastPlaceId", -203024573);
        setField(term569671, term569671.getClass(), "lastPlaceName", "yDdYuDowNP");
        setIntField(term569671, term569671.getClass(), "lastAllNetId", 1293962278);
        setIntField(term569671, term569671.getClass(), "lastRegionId", 2085964163);
        setField(term569671, term569671.getClass(), "lastRegionName", "dctnusEHKD");
        setField(term569671, term569671.getClass(), "lastClientId", "YWiwnohJWX");
        setField(term569671, term569671.getClass(), "lastCountryCode", "ysMGJnXXFs");
        setIntField(term569671, term569671.getClass(), "lastSelectEMoney", 1168157018);
        setIntField(term569671, term569671.getClass(), "lastSelectTicket", 924618754);
        setIntField(term569671, term569671.getClass(), "lastSelectCourse", 1339884695);
        setIntField(term569671, term569671.getClass(), "lastCountCourse", -501357504);
        setField(term569671, term569671.getClass(), "firstGameId", "vFZqKGdcdz");
        setField(term569671, term569671.getClass(), "firstRomVersion", "YciocxSwWi");
        setField(term569671, term569671.getClass(), "firstDataVersion", "GsZytoiQhO");
        setField(term569671, term569671.getClass(), "firstPlayDate", "CbMIwEGmpN");
        setField(term569671, term569671.getClass(), "compatibleCmVersion", "qVmedrpbea");
        setField(term569671, term569671.getClass(), "dailyBonusDate", "pwVsQOvtCz");
        setField(term569671, term569671.getClass(), "dailyCourseBonusDate", "YxQRUuLguX");
        setField(term569671, term569671.getClass(), "lastPairLoginDate", "kFLzxgcvai");
        setField(term569671, term569671.getClass(), "lastTrialPlayDate", "gulwMbPcga");
        setIntField(term569671, term569671.getClass(), "playVsCount", 1069926096);
        setIntField(term569671, term569671.getClass(), "playSyncCount", -742914022);
        setIntField(term569671, term569671.getClass(), "winCount", 839848894);
        setIntField(term569671, term569671.getClass(), "helpCount", -1822881326);
        setIntField(term569671, term569671.getClass(), "comboCount", 901778990);
        setLongField(term569671, term569671.getClass(), "totalDeluxscore", -3836578291435366127L);
        setLongField(term569671, term569671.getClass(), "totalBasicDeluxscore", -4331914391282374846L);
        setLongField(term569671, term569671.getClass(), "totalAdvancedDeluxscore", -5556744739507432692L);
        setLongField(term569671, term569671.getClass(), "totalExpertDeluxscore", 2091740260190613246L);
        setLongField(term569671, term569671.getClass(), "totalMasterDeluxscore", -851422098323544830L);
        setLongField(term569671, term569671.getClass(), "totalReMasterDeluxscore", 6618166813076599264L);
        setIntField(term569671, term569671.getClass(), "totalSync", 591058608);
        setIntField(term569671, term569671.getClass(), "totalBasicSync", 1500288507);
        setIntField(term569671, term569671.getClass(), "totalAdvancedSync", 55669009);
        setIntField(term569671, term569671.getClass(), "totalExpertSync", -855877984);
        setIntField(term569671, term569671.getClass(), "totalMasterSync", 2069359904);
        setIntField(term569671, term569671.getClass(), "totalReMasterSync", -1402139067);
        setLongField(term569671, term569671.getClass(), "totalAchievement", 2248450608136062797L);
        setLongField(term569671, term569671.getClass(), "totalBasicAchievement", 899311281938159151L);
        setLongField(term569671, term569671.getClass(), "totalAdvancedAchievement", 2475968866334392045L);
        setLongField(term569671, term569671.getClass(), "totalExpertAchievement", 6064502439946361874L);
        setLongField(term569671, term569671.getClass(), "totalMasterAchievement", 525529454775327624L);
        setLongField(term569671, term569671.getClass(), "totalReMasterAchievement", 9147779877635503409L);
        setLongField(term569671, term569671.getClass(), "playerOldRating", 1102365002665152945L);
        setLongField(term569671, term569671.getClass(), "playerNewRating", 8636252750368387740L);
        setIntField(term569671, term569671.getClass(), "banState", -190894187);
        setLongField(term569671, term569671.getClass(), "dateTime", 4410355957384721772L);
        setField(term569669, term569669.getClass(), "user", term569671);
        setLongField(term569669, term569669.getClass(), "favUserId", -2380889839697793813L);
        setIntField(term569669, term569669.getClass(), "itemKind", 1119127727);
        setField(term569669, term569669.getClass(), "itemIdList", term570028);
        term570038 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserFavorite");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term570038;
        callMethod(klass, "setItemIdList", argTypes, term569669, args);
    }

};


