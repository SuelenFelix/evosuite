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

public class UserData_setNetBattleEndState_1170657896405 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term292909;
     Object term292986;

    public UserData_setNetBattleEndState_1170657896405() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term292909 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term292909, term292909.getClass(), "id", 0L);
        setField(term292909, term292909.getClass(), "card", null);
        setField(term292909, term292909.getClass(), "userName", null);
        setIntField(term292909, term292909.getClass(), "level", 0);
        setIntField(term292909, term292909.getClass(), "reincarnationNum", 0);
        setField(term292909, term292909.getClass(), "exp", null);
        setLongField(term292909, term292909.getClass(), "point", 0L);
        setLongField(term292909, term292909.getClass(), "totalPoint", 0L);
        setIntField(term292909, term292909.getClass(), "playCount", 0);
        setIntField(term292909, term292909.getClass(), "multiPlayCount", 0);
        setIntField(term292909, term292909.getClass(), "playerRating", 0);
        setIntField(term292909, term292909.getClass(), "highestRating", 0);
        setIntField(term292909, term292909.getClass(), "nameplateId", 0);
        setIntField(term292909, term292909.getClass(), "frameId", 0);
        setIntField(term292909, term292909.getClass(), "characterId", 0);
        setIntField(term292909, term292909.getClass(), "trophyId", 0);
        setIntField(term292909, term292909.getClass(), "playedTutorialBit", 0);
        setIntField(term292909, term292909.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term292909, term292909.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term292909, term292909.getClass(), "totalMapNum", 0);
        setLongField(term292909, term292909.getClass(), "totalHiScore", 0L);
        setLongField(term292909, term292909.getClass(), "totalBasicHighScore", 0L);
        setLongField(term292909, term292909.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term292909, term292909.getClass(), "totalExpertHighScore", 0L);
        setLongField(term292909, term292909.getClass(), "totalMasterHighScore", 0L);
        setLongField(term292909, term292909.getClass(), "totalUltimaHighScore", 0L);
        setField(term292909, term292909.getClass(), "eventWatchedDate", null);
        setIntField(term292909, term292909.getClass(), "friendCount", 0);
        setField(term292909, term292909.getClass(), "firstGameId", null);
        setField(term292909, term292909.getClass(), "firstRomVersion", null);
        setField(term292909, term292909.getClass(), "firstDataVersion", null);
        setField(term292909, term292909.getClass(), "firstPlayDate", null);
        setField(term292909, term292909.getClass(), "lastGameId", null);
        setField(term292909, term292909.getClass(), "lastRomVersion", null);
        setField(term292909, term292909.getClass(), "lastDataVersion", null);
        setField(term292909, term292909.getClass(), "lastLoginDate", null);
        setField(term292909, term292909.getClass(), "lastPlayDate", null);
        setIntField(term292909, term292909.getClass(), "lastPlaceId", 0);
        setField(term292909, term292909.getClass(), "lastPlaceName", null);
        setField(term292909, term292909.getClass(), "lastRegionId", null);
        setField(term292909, term292909.getClass(), "lastRegionName", null);
        setField(term292909, term292909.getClass(), "lastAllNetId", null);
        setField(term292909, term292909.getClass(), "lastClientId", null);
        setField(term292909, term292909.getClass(), "lastCountryCode", null);
        setField(term292909, term292909.getClass(), "userNameEx", null);
        setField(term292909, term292909.getClass(), "compatibleCmVersion", null);
        setIntField(term292909, term292909.getClass(), "medal", 0);
        setIntField(term292909, term292909.getClass(), "mapIconId", 0);
        setIntField(term292909, term292909.getClass(), "voiceId", 0);
        setIntField(term292909, term292909.getClass(), "avatarWear", 0);
        setIntField(term292909, term292909.getClass(), "avatarHead", 0);
        setIntField(term292909, term292909.getClass(), "avatarFace", 0);
        setIntField(term292909, term292909.getClass(), "avatarSkin", 0);
        setIntField(term292909, term292909.getClass(), "avatarItem", 0);
        setIntField(term292909, term292909.getClass(), "avatarFront", 0);
        setIntField(term292909, term292909.getClass(), "avatarBack", 0);
        setIntField(term292909, term292909.getClass(), "classEmblemBase", 0);
        setIntField(term292909, term292909.getClass(), "classEmblemMedal", 0);
        setIntField(term292909, term292909.getClass(), "stockedGridCount", 0);
        setIntField(term292909, term292909.getClass(), "exMapLoopCount", 0);
        setIntField(term292909, term292909.getClass(), "netBattlePlayCount", 0);
        setIntField(term292909, term292909.getClass(), "netBattleWinCount", 0);
        setIntField(term292909, term292909.getClass(), "netBattleLoseCount", 0);
        setIntField(term292909, term292909.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term292909, term292909.getClass(), "charaIllustId", 0);
        setIntField(term292909, term292909.getClass(), "skillId", 0);
        setIntField(term292909, term292909.getClass(), "overPowerPoint", 0);
        setIntField(term292909, term292909.getClass(), "overPowerRate", 0);
        setIntField(term292909, term292909.getClass(), "overPowerLowerRank", 0);
        setIntField(term292909, term292909.getClass(), "avatarPoint", 0);
        setIntField(term292909, term292909.getClass(), "battleRankId", 0);
        setIntField(term292909, term292909.getClass(), "battleRankPoint", 0);
        setIntField(term292909, term292909.getClass(), "eliteRankPoint", 0);
        setIntField(term292909, term292909.getClass(), "netBattle1stCount", 0);
        setIntField(term292909, term292909.getClass(), "netBattle2ndCount", 0);
        setIntField(term292909, term292909.getClass(), "netBattle3rdCount", 0);
        setIntField(term292909, term292909.getClass(), "netBattle4thCount", 0);
        setIntField(term292909, term292909.getClass(), "netBattleCorrection", 0);
        setIntField(term292909, term292909.getClass(), "netBattleErrCnt", 0);
        setIntField(term292909, term292909.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term292909, term292909.getClass(), "battleRewardStatus", 0);
        setIntField(term292909, term292909.getClass(), "battleRewardIndex", 0);
        setIntField(term292909, term292909.getClass(), "battleRewardCount", 0);
        setIntField(term292909, term292909.getClass(), "ext1", 0);
        setIntField(term292909, term292909.getClass(), "ext2", 0);
        setIntField(term292909, term292909.getClass(), "ext3", 0);
        setIntField(term292909, term292909.getClass(), "ext4", 0);
        setIntField(term292909, term292909.getClass(), "ext5", 0);
        setIntField(term292909, term292909.getClass(), "ext6", 0);
        setIntField(term292909, term292909.getClass(), "ext7", 0);
        setIntField(term292909, term292909.getClass(), "ext8", 0);
        setIntField(term292909, term292909.getClass(), "ext9", 0);
        setIntField(term292909, term292909.getClass(), "ext10", 0);
        setField(term292909, term292909.getClass(), "extStr1", null);
        setField(term292909, term292909.getClass(), "extStr2", null);
        setLongField(term292909, term292909.getClass(), "extLong1", 0L);
        setLongField(term292909, term292909.getClass(), "extLong2", 0L);
        setField(term292909, term292909.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term292909, term292909.getClass(), "isNetBattleHost", false);
        setIntField(term292909, term292909.getClass(), "netBattleEndState", 0);
        term292986 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term292986;
        callMethod(klass, "setNetBattleEndState", argTypes, term292909, args);
    }

};


