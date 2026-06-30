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

public class UserData_setExp_869367077311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term285527;

    public UserData_setExp_869367077311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term285527 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term285527, term285527.getClass(), "id", 0L);
        setField(term285527, term285527.getClass(), "card", null);
        setField(term285527, term285527.getClass(), "userName", null);
        setIntField(term285527, term285527.getClass(), "level", 0);
        setIntField(term285527, term285527.getClass(), "reincarnationNum", 0);
        setField(term285527, term285527.getClass(), "exp", null);
        setLongField(term285527, term285527.getClass(), "point", 0L);
        setLongField(term285527, term285527.getClass(), "totalPoint", 0L);
        setIntField(term285527, term285527.getClass(), "playCount", 0);
        setIntField(term285527, term285527.getClass(), "multiPlayCount", 0);
        setIntField(term285527, term285527.getClass(), "playerRating", 0);
        setIntField(term285527, term285527.getClass(), "highestRating", 0);
        setIntField(term285527, term285527.getClass(), "nameplateId", 0);
        setIntField(term285527, term285527.getClass(), "frameId", 0);
        setIntField(term285527, term285527.getClass(), "characterId", 0);
        setIntField(term285527, term285527.getClass(), "trophyId", 0);
        setIntField(term285527, term285527.getClass(), "playedTutorialBit", 0);
        setIntField(term285527, term285527.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term285527, term285527.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term285527, term285527.getClass(), "totalMapNum", 0);
        setLongField(term285527, term285527.getClass(), "totalHiScore", 0L);
        setLongField(term285527, term285527.getClass(), "totalBasicHighScore", 0L);
        setLongField(term285527, term285527.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term285527, term285527.getClass(), "totalExpertHighScore", 0L);
        setLongField(term285527, term285527.getClass(), "totalMasterHighScore", 0L);
        setLongField(term285527, term285527.getClass(), "totalUltimaHighScore", 0L);
        setField(term285527, term285527.getClass(), "eventWatchedDate", null);
        setIntField(term285527, term285527.getClass(), "friendCount", 0);
        setField(term285527, term285527.getClass(), "firstGameId", null);
        setField(term285527, term285527.getClass(), "firstRomVersion", null);
        setField(term285527, term285527.getClass(), "firstDataVersion", null);
        setField(term285527, term285527.getClass(), "firstPlayDate", null);
        setField(term285527, term285527.getClass(), "lastGameId", null);
        setField(term285527, term285527.getClass(), "lastRomVersion", null);
        setField(term285527, term285527.getClass(), "lastDataVersion", null);
        setField(term285527, term285527.getClass(), "lastLoginDate", null);
        setField(term285527, term285527.getClass(), "lastPlayDate", null);
        setIntField(term285527, term285527.getClass(), "lastPlaceId", 0);
        setField(term285527, term285527.getClass(), "lastPlaceName", null);
        setField(term285527, term285527.getClass(), "lastRegionId", null);
        setField(term285527, term285527.getClass(), "lastRegionName", null);
        setField(term285527, term285527.getClass(), "lastAllNetId", null);
        setField(term285527, term285527.getClass(), "lastClientId", null);
        setField(term285527, term285527.getClass(), "lastCountryCode", null);
        setField(term285527, term285527.getClass(), "userNameEx", null);
        setField(term285527, term285527.getClass(), "compatibleCmVersion", null);
        setIntField(term285527, term285527.getClass(), "medal", 0);
        setIntField(term285527, term285527.getClass(), "mapIconId", 0);
        setIntField(term285527, term285527.getClass(), "voiceId", 0);
        setIntField(term285527, term285527.getClass(), "avatarWear", 0);
        setIntField(term285527, term285527.getClass(), "avatarHead", 0);
        setIntField(term285527, term285527.getClass(), "avatarFace", 0);
        setIntField(term285527, term285527.getClass(), "avatarSkin", 0);
        setIntField(term285527, term285527.getClass(), "avatarItem", 0);
        setIntField(term285527, term285527.getClass(), "avatarFront", 0);
        setIntField(term285527, term285527.getClass(), "avatarBack", 0);
        setIntField(term285527, term285527.getClass(), "classEmblemBase", 0);
        setIntField(term285527, term285527.getClass(), "classEmblemMedal", 0);
        setIntField(term285527, term285527.getClass(), "stockedGridCount", 0);
        setIntField(term285527, term285527.getClass(), "exMapLoopCount", 0);
        setIntField(term285527, term285527.getClass(), "netBattlePlayCount", 0);
        setIntField(term285527, term285527.getClass(), "netBattleWinCount", 0);
        setIntField(term285527, term285527.getClass(), "netBattleLoseCount", 0);
        setIntField(term285527, term285527.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term285527, term285527.getClass(), "charaIllustId", 0);
        setIntField(term285527, term285527.getClass(), "skillId", 0);
        setIntField(term285527, term285527.getClass(), "overPowerPoint", 0);
        setIntField(term285527, term285527.getClass(), "overPowerRate", 0);
        setIntField(term285527, term285527.getClass(), "overPowerLowerRank", 0);
        setIntField(term285527, term285527.getClass(), "avatarPoint", 0);
        setIntField(term285527, term285527.getClass(), "battleRankId", 0);
        setIntField(term285527, term285527.getClass(), "battleRankPoint", 0);
        setIntField(term285527, term285527.getClass(), "eliteRankPoint", 0);
        setIntField(term285527, term285527.getClass(), "netBattle1stCount", 0);
        setIntField(term285527, term285527.getClass(), "netBattle2ndCount", 0);
        setIntField(term285527, term285527.getClass(), "netBattle3rdCount", 0);
        setIntField(term285527, term285527.getClass(), "netBattle4thCount", 0);
        setIntField(term285527, term285527.getClass(), "netBattleCorrection", 0);
        setIntField(term285527, term285527.getClass(), "netBattleErrCnt", 0);
        setIntField(term285527, term285527.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term285527, term285527.getClass(), "battleRewardStatus", 0);
        setIntField(term285527, term285527.getClass(), "battleRewardIndex", 0);
        setIntField(term285527, term285527.getClass(), "battleRewardCount", 0);
        setIntField(term285527, term285527.getClass(), "ext1", 0);
        setIntField(term285527, term285527.getClass(), "ext2", 0);
        setIntField(term285527, term285527.getClass(), "ext3", 0);
        setIntField(term285527, term285527.getClass(), "ext4", 0);
        setIntField(term285527, term285527.getClass(), "ext5", 0);
        setIntField(term285527, term285527.getClass(), "ext6", 0);
        setIntField(term285527, term285527.getClass(), "ext7", 0);
        setIntField(term285527, term285527.getClass(), "ext8", 0);
        setIntField(term285527, term285527.getClass(), "ext9", 0);
        setIntField(term285527, term285527.getClass(), "ext10", 0);
        setField(term285527, term285527.getClass(), "extStr1", null);
        setField(term285527, term285527.getClass(), "extStr2", null);
        setLongField(term285527, term285527.getClass(), "extLong1", 0L);
        setLongField(term285527, term285527.getClass(), "extLong2", 0L);
        setField(term285527, term285527.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term285527, term285527.getClass(), "isNetBattleHost", false);
        setIntField(term285527, term285527.getClass(), "netBattleEndState", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setExp", argTypes, term285527, args);
    }

};


