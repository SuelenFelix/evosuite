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

public class UserMap_canEqual_171983481216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term583024;
     Object term583390;

    public UserMap_canEqual_171983481216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term583030 = new Long(9069301103965727560L);
        Integer term583093 = new Integer(-310872754);
        Integer term583095 = new Integer(-2006897036);
        Integer term583097 = new Integer(99466182);
        ArrayList term583091 = new ArrayList();
        ((ArrayList) term583091).add(term583093);
        ((ArrayList) term583091).add(term583095);
        ((ArrayList) term583091).add(term583097);
        Integer term583103 = new Integer(-1520548826);
        Integer term583105 = new Integer(1183263051);
        Integer term583107 = new Integer(626039325);
        Integer term583109 = new Integer(-1990497476);
        Integer term583111 = new Integer(304456317);
        Integer term583113 = new Integer(-352562026);
        Integer term583115 = new Integer(-1805465595);
        ArrayList term583101 = new ArrayList();
        ((ArrayList) term583101).add(term583103);
        ((ArrayList) term583101).add(term583105);
        ((ArrayList) term583101).add(term583107);
        ((ArrayList) term583101).add(term583109);
        ((ArrayList) term583101).add(term583111);
        ((ArrayList) term583101).add(term583113);
        ((ArrayList) term583101).add(term583115);
        term583024 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserMap"));
        Object term583026 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term583028 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term583044 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term583045 = newInstance(Class.forName("java.time.LocalDate"));
        Object term583049 = newInstance(Class.forName("java.time.LocalTime"));
        Object term583054 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term583055 = newInstance(Class.forName("java.time.LocalDate"));
        Object term583059 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term583024, term583024.getClass(), "id", -4902136331524521489L);
        setLongField(term583026, term583026.getClass(), "id", -3208990168925597033L);
        setLongField(term583028, term583028.getClass(), "id", 2567039694260641995L);
        setField(term583028, term583028.getClass(), "extId", term583030);
        setField(term583028, term583028.getClass(), "luid", "RhRyuLTYgk");
        setIntField(term583045, term583045.getClass(), "year", 2011);
        setShortField(term583045, term583045.getClass(), "month", (short) 8);
        setShortField(term583045, term583045.getClass(), "day", (short) 23);
        setField(term583044, term583044.getClass(), "date", term583045);
        setByteField(term583049, term583049.getClass(), "hour", (byte) 19);
        setByteField(term583049, term583049.getClass(), "minute", (byte) 16);
        setByteField(term583049, term583049.getClass(), "second", (byte) 0);
        setIntField(term583049, term583049.getClass(), "nano", 640387013);
        setField(term583044, term583044.getClass(), "time", term583049);
        setField(term583028, term583028.getClass(), "registerTime", term583044);
        setIntField(term583055, term583055.getClass(), "year", 2019);
        setShortField(term583055, term583055.getClass(), "month", (short) 10);
        setShortField(term583055, term583055.getClass(), "day", (short) 14);
        setField(term583054, term583054.getClass(), "date", term583055);
        setByteField(term583059, term583059.getClass(), "hour", (byte) 3);
        setByteField(term583059, term583059.getClass(), "minute", (byte) 24);
        setByteField(term583059, term583059.getClass(), "second", (byte) 52);
        setIntField(term583059, term583059.getClass(), "nano", 901189499);
        setField(term583054, term583054.getClass(), "time", term583059);
        setField(term583028, term583028.getClass(), "accessTime", term583054);
        setField(term583026, term583026.getClass(), "card", term583028);
        setField(term583026, term583026.getClass(), "userName", "XwMOHkEzzz");
        setIntField(term583026, term583026.getClass(), "isNetMember", 993065496);
        setIntField(term583026, term583026.getClass(), "iconId", -613871550);
        setIntField(term583026, term583026.getClass(), "plateId", 1926612356);
        setIntField(term583026, term583026.getClass(), "titleId", -161335423);
        setIntField(term583026, term583026.getClass(), "partnerId", 1105503313);
        setIntField(term583026, term583026.getClass(), "frameId", -224507521);
        setIntField(term583026, term583026.getClass(), "selectMapId", -1566399629);
        setIntField(term583026, term583026.getClass(), "totalAwake", 648224495);
        setIntField(term583026, term583026.getClass(), "gradeRating", -617759900);
        setIntField(term583026, term583026.getClass(), "musicRating", 964955817);
        setIntField(term583026, term583026.getClass(), "playerRating", 315841518);
        setIntField(term583026, term583026.getClass(), "highestRating", -439874731);
        setIntField(term583026, term583026.getClass(), "gradeRank", -126782651);
        setIntField(term583026, term583026.getClass(), "classRank", -789536179);
        setIntField(term583026, term583026.getClass(), "courseRank", -757768965);
        setField(term583026, term583026.getClass(), "charaSlot", term583091);
        setField(term583026, term583026.getClass(), "charaLockSlot", term583101);
        setLongField(term583026, term583026.getClass(), "contentBit", 1830181540755805528L);
        setIntField(term583026, term583026.getClass(), "playCount", 136921494);
        setField(term583026, term583026.getClass(), "eventWatchedDate", "QqAoYMChuR");
        setField(term583026, term583026.getClass(), "lastGameId", "IISCFzMGhw");
        setField(term583026, term583026.getClass(), "lastRomVersion", "RRRoKRQIyx");
        setField(term583026, term583026.getClass(), "lastDataVersion", "yiaFjSIDGt");
        setField(term583026, term583026.getClass(), "lastLoginDate", "qHAHlyZxmC");
        setField(term583026, term583026.getClass(), "lastPlayDate", "WesjsHIRsO");
        setIntField(term583026, term583026.getClass(), "lastPlayCredit", 1278053532);
        setIntField(term583026, term583026.getClass(), "lastPlayMode", 178430230);
        setIntField(term583026, term583026.getClass(), "lastPlaceId", 358523132);
        setField(term583026, term583026.getClass(), "lastPlaceName", "LRUQKaHkMh");
        setIntField(term583026, term583026.getClass(), "lastAllNetId", -1790366853);
        setIntField(term583026, term583026.getClass(), "lastRegionId", -594204559);
        setField(term583026, term583026.getClass(), "lastRegionName", "twpaGuyOKw");
        setField(term583026, term583026.getClass(), "lastClientId", "VFVFWZwYxu");
        setField(term583026, term583026.getClass(), "lastCountryCode", "gbcqIhRNjh");
        setIntField(term583026, term583026.getClass(), "lastSelectEMoney", -30745233);
        setIntField(term583026, term583026.getClass(), "lastSelectTicket", 1720028045);
        setIntField(term583026, term583026.getClass(), "lastSelectCourse", -1412180482);
        setIntField(term583026, term583026.getClass(), "lastCountCourse", 24814371);
        setField(term583026, term583026.getClass(), "firstGameId", "hdUfHDCmQO");
        setField(term583026, term583026.getClass(), "firstRomVersion", "yQEBPBEdma");
        setField(term583026, term583026.getClass(), "firstDataVersion", "uRMPVBmxOf");
        setField(term583026, term583026.getClass(), "firstPlayDate", "gSMQuyJQHz");
        setField(term583026, term583026.getClass(), "compatibleCmVersion", "ZtPVQZAfYl");
        setField(term583026, term583026.getClass(), "dailyBonusDate", "NLRZohmSeU");
        setField(term583026, term583026.getClass(), "dailyCourseBonusDate", "lyauneSCGA");
        setField(term583026, term583026.getClass(), "lastPairLoginDate", "iTzYTXomXT");
        setField(term583026, term583026.getClass(), "lastTrialPlayDate", "TxxClGfarR");
        setIntField(term583026, term583026.getClass(), "playVsCount", 824562028);
        setIntField(term583026, term583026.getClass(), "playSyncCount", -1632026736);
        setIntField(term583026, term583026.getClass(), "winCount", -987656251);
        setIntField(term583026, term583026.getClass(), "helpCount", 386378398);
        setIntField(term583026, term583026.getClass(), "comboCount", -1551906070);
        setLongField(term583026, term583026.getClass(), "totalDeluxscore", -6145726174588854926L);
        setLongField(term583026, term583026.getClass(), "totalBasicDeluxscore", 7549863667319326650L);
        setLongField(term583026, term583026.getClass(), "totalAdvancedDeluxscore", -1420706667593904389L);
        setLongField(term583026, term583026.getClass(), "totalExpertDeluxscore", 9014877226153418692L);
        setLongField(term583026, term583026.getClass(), "totalMasterDeluxscore", -181913600791425455L);
        setLongField(term583026, term583026.getClass(), "totalReMasterDeluxscore", 6813249840760321123L);
        setIntField(term583026, term583026.getClass(), "totalSync", 1151386245);
        setIntField(term583026, term583026.getClass(), "totalBasicSync", 1147562988);
        setIntField(term583026, term583026.getClass(), "totalAdvancedSync", -1457257524);
        setIntField(term583026, term583026.getClass(), "totalExpertSync", 1049441780);
        setIntField(term583026, term583026.getClass(), "totalMasterSync", -109543138);
        setIntField(term583026, term583026.getClass(), "totalReMasterSync", 806399239);
        setLongField(term583026, term583026.getClass(), "totalAchievement", -245507790011294991L);
        setLongField(term583026, term583026.getClass(), "totalBasicAchievement", 2293095635313654230L);
        setLongField(term583026, term583026.getClass(), "totalAdvancedAchievement", 5471430513636706289L);
        setLongField(term583026, term583026.getClass(), "totalExpertAchievement", -6327928966831759284L);
        setLongField(term583026, term583026.getClass(), "totalMasterAchievement", 1455902339409933635L);
        setLongField(term583026, term583026.getClass(), "totalReMasterAchievement", -34162610267211574L);
        setLongField(term583026, term583026.getClass(), "playerOldRating", -9108616539118511813L);
        setLongField(term583026, term583026.getClass(), "playerNewRating", -4011225664285375406L);
        setIntField(term583026, term583026.getClass(), "banState", 1417589579);
        setLongField(term583026, term583026.getClass(), "dateTime", -3038583253716410802L);
        setField(term583024, term583024.getClass(), "user", term583026);
        setIntField(term583024, term583024.getClass(), "mapId", 2121443688);
        setIntField(term583024, term583024.getClass(), "distance", -185923310);
        setBooleanField(term583024, term583024.getClass(), "isLock", false);
        setBooleanField(term583024, term583024.getClass(), "isClear", true);
        setBooleanField(term583024, term583024.getClass(), "isComplete", false);
        term583390 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term583390;
        callMethod(klass, "canEqual", argTypes, term583024, args);
    }

};


