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

public class UserExtend_getExtendContentBit_2617188839 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term146737;

    public UserExtend_getExtendContentBit_2617188839() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term146743 = new Long(-8862087040734407227L);
        Integer term146806 = new Integer(664155196);
        Integer term146808 = new Integer(-1103257588);
        Integer term146810 = new Integer(1463219831);
        Integer term146812 = new Integer(-1516863216);
        ArrayList term146804 = new ArrayList();
        ((ArrayList) term146804).add(term146806);
        ((ArrayList) term146804).add(term146808);
        ((ArrayList) term146804).add(term146810);
        ((ArrayList) term146804).add(term146812);
        Integer term146818 = new Integer(1392468004);
        Integer term146820 = new Integer(-1568339070);
        Integer term146822 = new Integer(-1427059961);
        Integer term146824 = new Integer(1120685189);
        Integer term146826 = new Integer(654585209);
        Integer term146828 = new Integer(-1661685401);
        Integer term146830 = new Integer(1427434947);
        ArrayList term146816 = new ArrayList();
        ((ArrayList) term146816).add(term146818);
        ((ArrayList) term146816).add(term146820);
        ((ArrayList) term146816).add(term146822);
        ((ArrayList) term146816).add(term146824);
        ((ArrayList) term146816).add(term146826);
        ((ArrayList) term146816).add(term146828);
        ((ArrayList) term146816).add(term146830);
        ArrayList term147112 = new ArrayList();
        ArrayList term147116 = new ArrayList();
        term146737 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserExtend"));
        Object term146739 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term146741 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term146757 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term146758 = newInstance(Class.forName("java.time.LocalDate"));
        Object term146762 = newInstance(Class.forName("java.time.LocalTime"));
        Object term146767 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term146768 = newInstance(Class.forName("java.time.LocalDate"));
        Object term146772 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term146737, term146737.getClass(), "id", 3589887434564854802L);
        setLongField(term146739, term146739.getClass(), "id", 3832614676568803980L);
        setLongField(term146741, term146741.getClass(), "id", -9022297844673196614L);
        setField(term146741, term146741.getClass(), "extId", term146743);
        setField(term146741, term146741.getClass(), "luid", "rnkaCxMcIX");
        setIntField(term146758, term146758.getClass(), "year", 2027);
        setShortField(term146758, term146758.getClass(), "month", (short) 10);
        setShortField(term146758, term146758.getClass(), "day", (short) 12);
        setField(term146757, term146757.getClass(), "date", term146758);
        setByteField(term146762, term146762.getClass(), "hour", (byte) 23);
        setByteField(term146762, term146762.getClass(), "minute", (byte) 45);
        setByteField(term146762, term146762.getClass(), "second", (byte) 21);
        setIntField(term146762, term146762.getClass(), "nano", 866836785);
        setField(term146757, term146757.getClass(), "time", term146762);
        setField(term146741, term146741.getClass(), "registerTime", term146757);
        setIntField(term146768, term146768.getClass(), "year", 2022);
        setShortField(term146768, term146768.getClass(), "month", (short) 5);
        setShortField(term146768, term146768.getClass(), "day", (short) 27);
        setField(term146767, term146767.getClass(), "date", term146768);
        setByteField(term146772, term146772.getClass(), "hour", (byte) 11);
        setByteField(term146772, term146772.getClass(), "minute", (byte) 48);
        setByteField(term146772, term146772.getClass(), "second", (byte) 27);
        setIntField(term146772, term146772.getClass(), "nano", 101970300);
        setField(term146767, term146767.getClass(), "time", term146772);
        setField(term146741, term146741.getClass(), "accessTime", term146767);
        setField(term146739, term146739.getClass(), "card", term146741);
        setField(term146739, term146739.getClass(), "userName", "EFZQPeNhLf");
        setIntField(term146739, term146739.getClass(), "isNetMember", -1244382496);
        setIntField(term146739, term146739.getClass(), "iconId", 328093796);
        setIntField(term146739, term146739.getClass(), "plateId", 1144911037);
        setIntField(term146739, term146739.getClass(), "titleId", 1177705449);
        setIntField(term146739, term146739.getClass(), "partnerId", 1193501284);
        setIntField(term146739, term146739.getClass(), "frameId", 446262970);
        setIntField(term146739, term146739.getClass(), "selectMapId", -1045053022);
        setIntField(term146739, term146739.getClass(), "totalAwake", -216095646);
        setIntField(term146739, term146739.getClass(), "gradeRating", -1379065103);
        setIntField(term146739, term146739.getClass(), "musicRating", -1782729310);
        setIntField(term146739, term146739.getClass(), "playerRating", 1359489825);
        setIntField(term146739, term146739.getClass(), "highestRating", 518021204);
        setIntField(term146739, term146739.getClass(), "gradeRank", 1949257992);
        setIntField(term146739, term146739.getClass(), "classRank", -1618417661);
        setIntField(term146739, term146739.getClass(), "courseRank", 1845352431);
        setField(term146739, term146739.getClass(), "charaSlot", term146804);
        setField(term146739, term146739.getClass(), "charaLockSlot", term146816);
        setLongField(term146739, term146739.getClass(), "contentBit", -9219229738152044167L);
        setIntField(term146739, term146739.getClass(), "playCount", 16970863);
        setField(term146739, term146739.getClass(), "eventWatchedDate", "XEJckhziWa");
        setField(term146739, term146739.getClass(), "lastGameId", "rnwvPkpKVX");
        setField(term146739, term146739.getClass(), "lastRomVersion", "BxSVyceqSm");
        setField(term146739, term146739.getClass(), "lastDataVersion", "wMPExrcpuS");
        setField(term146739, term146739.getClass(), "lastLoginDate", "OarbTBiJae");
        setField(term146739, term146739.getClass(), "lastPlayDate", "mXZKaytExY");
        setIntField(term146739, term146739.getClass(), "lastPlayCredit", 702867666);
        setIntField(term146739, term146739.getClass(), "lastPlayMode", 347847504);
        setIntField(term146739, term146739.getClass(), "lastPlaceId", -25604178);
        setField(term146739, term146739.getClass(), "lastPlaceName", "YePrhNqEVB");
        setIntField(term146739, term146739.getClass(), "lastAllNetId", -662117106);
        setIntField(term146739, term146739.getClass(), "lastRegionId", -1490593932);
        setField(term146739, term146739.getClass(), "lastRegionName", "ItBnSfBOeK");
        setField(term146739, term146739.getClass(), "lastClientId", "UgJLdCLLek");
        setField(term146739, term146739.getClass(), "lastCountryCode", "lWjrRjjSxQ");
        setIntField(term146739, term146739.getClass(), "lastSelectEMoney", 503810132);
        setIntField(term146739, term146739.getClass(), "lastSelectTicket", 1371231836);
        setIntField(term146739, term146739.getClass(), "lastSelectCourse", -316604772);
        setIntField(term146739, term146739.getClass(), "lastCountCourse", 1189774759);
        setField(term146739, term146739.getClass(), "firstGameId", "YTiiBmPBxA");
        setField(term146739, term146739.getClass(), "firstRomVersion", "DeKKQvsCKV");
        setField(term146739, term146739.getClass(), "firstDataVersion", "djcluFSRjM");
        setField(term146739, term146739.getClass(), "firstPlayDate", "MBcybJsfOP");
        setField(term146739, term146739.getClass(), "compatibleCmVersion", "spZaeqpTCZ");
        setField(term146739, term146739.getClass(), "dailyBonusDate", "vXFjQWxORA");
        setField(term146739, term146739.getClass(), "dailyCourseBonusDate", "jzhkCKcgje");
        setField(term146739, term146739.getClass(), "lastPairLoginDate", "THllnCKhSX");
        setField(term146739, term146739.getClass(), "lastTrialPlayDate", "QENisOjsdU");
        setIntField(term146739, term146739.getClass(), "playVsCount", 938460209);
        setIntField(term146739, term146739.getClass(), "playSyncCount", 365759248);
        setIntField(term146739, term146739.getClass(), "winCount", -891609036);
        setIntField(term146739, term146739.getClass(), "helpCount", -938051706);
        setIntField(term146739, term146739.getClass(), "comboCount", 224101797);
        setLongField(term146739, term146739.getClass(), "totalDeluxscore", -5441503566272414410L);
        setLongField(term146739, term146739.getClass(), "totalBasicDeluxscore", 4469226428781556114L);
        setLongField(term146739, term146739.getClass(), "totalAdvancedDeluxscore", -9201976981313046937L);
        setLongField(term146739, term146739.getClass(), "totalExpertDeluxscore", -3746697811395336378L);
        setLongField(term146739, term146739.getClass(), "totalMasterDeluxscore", 4721016240026367204L);
        setLongField(term146739, term146739.getClass(), "totalReMasterDeluxscore", -6733831402487604203L);
        setIntField(term146739, term146739.getClass(), "totalSync", -136266270);
        setIntField(term146739, term146739.getClass(), "totalBasicSync", 1619823751);
        setIntField(term146739, term146739.getClass(), "totalAdvancedSync", -1457875542);
        setIntField(term146739, term146739.getClass(), "totalExpertSync", 2137234063);
        setIntField(term146739, term146739.getClass(), "totalMasterSync", 1813360939);
        setIntField(term146739, term146739.getClass(), "totalReMasterSync", 565044482);
        setLongField(term146739, term146739.getClass(), "totalAchievement", 1643405476807051074L);
        setLongField(term146739, term146739.getClass(), "totalBasicAchievement", 2633886100159321465L);
        setLongField(term146739, term146739.getClass(), "totalAdvancedAchievement", -2199549335846151532L);
        setLongField(term146739, term146739.getClass(), "totalExpertAchievement", -4078270228750639613L);
        setLongField(term146739, term146739.getClass(), "totalMasterAchievement", 9161067875811424821L);
        setLongField(term146739, term146739.getClass(), "totalReMasterAchievement", -582572885387389757L);
        setLongField(term146739, term146739.getClass(), "playerOldRating", -290834134358456380L);
        setLongField(term146739, term146739.getClass(), "playerNewRating", 8577245396068175597L);
        setIntField(term146739, term146739.getClass(), "banState", -1069288589);
        setLongField(term146739, term146739.getClass(), "dateTime", -3585460109412323473L);
        setField(term146737, term146737.getClass(), "user", term146739);
        setIntField(term146737, term146737.getClass(), "selectMusicId", -1297223247);
        setIntField(term146737, term146737.getClass(), "selectDifficultyId", -149276178);
        setIntField(term146737, term146737.getClass(), "categoryIndex", -1938083024);
        setIntField(term146737, term146737.getClass(), "musicIndex", -2147408216);
        setIntField(term146737, term146737.getClass(), "extraFlag", 678386871);
        setIntField(term146737, term146737.getClass(), "selectScoreType", -1142230123);
        setLongField(term146737, term146737.getClass(), "extendContentBit", 5755635274828361656L);
        setBooleanField(term146737, term146737.getClass(), "isPhotoAgree", false);
        setBooleanField(term146737, term146737.getClass(), "isGotoCodeRead", true);
        setBooleanField(term146737, term146737.getClass(), "selectResultDetails", false);
        setIntField(term146737, term146737.getClass(), "sortCategorySetting", 247506012);
        setIntField(term146737, term146737.getClass(), "sortMusicSetting", -2049735614);
        setField(term146737, term146737.getClass(), "selectedCardList", term147112);
        setField(term146737, term146737.getClass(), "encountMapNpcList", term147116);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserExtend");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExtendContentBit", argTypes, term146737, args);
    }

};


