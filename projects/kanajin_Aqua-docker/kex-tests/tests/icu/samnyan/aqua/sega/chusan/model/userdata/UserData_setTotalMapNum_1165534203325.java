package icu.samnyan.aqua.sega.chusan.model.userdata;

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
import static icu.samnyan.aqua.sega.chusan.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class UserData_setTotalMapNum_1165534203325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term286631;
     Object term286708;

    public UserData_setTotalMapNum_1165534203325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term286631 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term286631, term286631.getClass(), "id", 0L);
        setField(term286631, term286631.getClass(), "card", null);
        setField(term286631, term286631.getClass(), "userName", null);
        setIntField(term286631, term286631.getClass(), "level", 0);
        setIntField(term286631, term286631.getClass(), "reincarnationNum", 0);
        setField(term286631, term286631.getClass(), "exp", null);
        setLongField(term286631, term286631.getClass(), "point", 0L);
        setLongField(term286631, term286631.getClass(), "totalPoint", 0L);
        setIntField(term286631, term286631.getClass(), "playCount", 0);
        setIntField(term286631, term286631.getClass(), "multiPlayCount", 0);
        setIntField(term286631, term286631.getClass(), "playerRating", 0);
        setIntField(term286631, term286631.getClass(), "highestRating", 0);
        setIntField(term286631, term286631.getClass(), "nameplateId", 0);
        setIntField(term286631, term286631.getClass(), "frameId", 0);
        setIntField(term286631, term286631.getClass(), "characterId", 0);
        setIntField(term286631, term286631.getClass(), "trophyId", 0);
        setIntField(term286631, term286631.getClass(), "playedTutorialBit", 0);
        setIntField(term286631, term286631.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term286631, term286631.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term286631, term286631.getClass(), "totalMapNum", 0);
        setLongField(term286631, term286631.getClass(), "totalHiScore", 0L);
        setLongField(term286631, term286631.getClass(), "totalBasicHighScore", 0L);
        setLongField(term286631, term286631.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term286631, term286631.getClass(), "totalExpertHighScore", 0L);
        setLongField(term286631, term286631.getClass(), "totalMasterHighScore", 0L);
        setLongField(term286631, term286631.getClass(), "totalUltimaHighScore", 0L);
        setField(term286631, term286631.getClass(), "eventWatchedDate", null);
        setIntField(term286631, term286631.getClass(), "friendCount", 0);
        setField(term286631, term286631.getClass(), "firstGameId", null);
        setField(term286631, term286631.getClass(), "firstRomVersion", null);
        setField(term286631, term286631.getClass(), "firstDataVersion", null);
        setField(term286631, term286631.getClass(), "firstPlayDate", null);
        setField(term286631, term286631.getClass(), "lastGameId", null);
        setField(term286631, term286631.getClass(), "lastRomVersion", null);
        setField(term286631, term286631.getClass(), "lastDataVersion", null);
        setField(term286631, term286631.getClass(), "lastLoginDate", null);
        setField(term286631, term286631.getClass(), "lastPlayDate", null);
        setIntField(term286631, term286631.getClass(), "lastPlaceId", 0);
        setField(term286631, term286631.getClass(), "lastPlaceName", null);
        setField(term286631, term286631.getClass(), "lastRegionId", null);
        setField(term286631, term286631.getClass(), "lastRegionName", null);
        setField(term286631, term286631.getClass(), "lastAllNetId", null);
        setField(term286631, term286631.getClass(), "lastClientId", null);
        setField(term286631, term286631.getClass(), "lastCountryCode", null);
        setField(term286631, term286631.getClass(), "userNameEx", null);
        setField(term286631, term286631.getClass(), "compatibleCmVersion", null);
        setIntField(term286631, term286631.getClass(), "medal", 0);
        setIntField(term286631, term286631.getClass(), "mapIconId", 0);
        setIntField(term286631, term286631.getClass(), "voiceId", 0);
        setIntField(term286631, term286631.getClass(), "avatarWear", 0);
        setIntField(term286631, term286631.getClass(), "avatarHead", 0);
        setIntField(term286631, term286631.getClass(), "avatarFace", 0);
        setIntField(term286631, term286631.getClass(), "avatarSkin", 0);
        setIntField(term286631, term286631.getClass(), "avatarItem", 0);
        setIntField(term286631, term286631.getClass(), "avatarFront", 0);
        setIntField(term286631, term286631.getClass(), "avatarBack", 0);
        setIntField(term286631, term286631.getClass(), "classEmblemBase", 0);
        setIntField(term286631, term286631.getClass(), "classEmblemMedal", 0);
        setIntField(term286631, term286631.getClass(), "stockedGridCount", 0);
        setIntField(term286631, term286631.getClass(), "exMapLoopCount", 0);
        setIntField(term286631, term286631.getClass(), "netBattlePlayCount", 0);
        setIntField(term286631, term286631.getClass(), "netBattleWinCount", 0);
        setIntField(term286631, term286631.getClass(), "netBattleLoseCount", 0);
        setIntField(term286631, term286631.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term286631, term286631.getClass(), "charaIllustId", 0);
        setIntField(term286631, term286631.getClass(), "skillId", 0);
        setIntField(term286631, term286631.getClass(), "overPowerPoint", 0);
        setIntField(term286631, term286631.getClass(), "overPowerRate", 0);
        setIntField(term286631, term286631.getClass(), "overPowerLowerRank", 0);
        setIntField(term286631, term286631.getClass(), "avatarPoint", 0);
        setIntField(term286631, term286631.getClass(), "battleRankId", 0);
        setIntField(term286631, term286631.getClass(), "battleRankPoint", 0);
        setIntField(term286631, term286631.getClass(), "eliteRankPoint", 0);
        setIntField(term286631, term286631.getClass(), "netBattle1stCount", 0);
        setIntField(term286631, term286631.getClass(), "netBattle2ndCount", 0);
        setIntField(term286631, term286631.getClass(), "netBattle3rdCount", 0);
        setIntField(term286631, term286631.getClass(), "netBattle4thCount", 0);
        setIntField(term286631, term286631.getClass(), "netBattleCorrection", 0);
        setIntField(term286631, term286631.getClass(), "netBattleErrCnt", 0);
        setIntField(term286631, term286631.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term286631, term286631.getClass(), "battleRewardStatus", 0);
        setIntField(term286631, term286631.getClass(), "battleRewardIndex", 0);
        setIntField(term286631, term286631.getClass(), "battleRewardCount", 0);
        setIntField(term286631, term286631.getClass(), "ext1", 0);
        setIntField(term286631, term286631.getClass(), "ext2", 0);
        setIntField(term286631, term286631.getClass(), "ext3", 0);
        setIntField(term286631, term286631.getClass(), "ext4", 0);
        setIntField(term286631, term286631.getClass(), "ext5", 0);
        setIntField(term286631, term286631.getClass(), "ext6", 0);
        setIntField(term286631, term286631.getClass(), "ext7", 0);
        setIntField(term286631, term286631.getClass(), "ext8", 0);
        setIntField(term286631, term286631.getClass(), "ext9", 0);
        setIntField(term286631, term286631.getClass(), "ext10", 0);
        setField(term286631, term286631.getClass(), "extStr1", null);
        setField(term286631, term286631.getClass(), "extStr2", null);
        setLongField(term286631, term286631.getClass(), "extLong1", 0L);
        setLongField(term286631, term286631.getClass(), "extLong2", 0L);
        setField(term286631, term286631.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term286631, term286631.getClass(), "isNetBattleHost", false);
        setIntField(term286631, term286631.getClass(), "netBattleEndState", 0);
        term286708 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term286708;
        callMethod(klass, "setTotalMapNum", argTypes, term286631, args);
    }

};


