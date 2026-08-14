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

public class UserData_setPlayerRating_537657041317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4220521;
     Object term4220598;

    public UserData_setPlayerRating_537657041317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4220521 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term4220521, term4220521.getClass(), "id", 0L);
        setField(term4220521, term4220521.getClass(), "card", null);
        setField(term4220521, term4220521.getClass(), "userName", null);
        setIntField(term4220521, term4220521.getClass(), "level", 0);
        setIntField(term4220521, term4220521.getClass(), "reincarnationNum", 0);
        setField(term4220521, term4220521.getClass(), "exp", null);
        setLongField(term4220521, term4220521.getClass(), "point", 0L);
        setLongField(term4220521, term4220521.getClass(), "totalPoint", 0L);
        setIntField(term4220521, term4220521.getClass(), "playCount", 0);
        setIntField(term4220521, term4220521.getClass(), "multiPlayCount", 0);
        setIntField(term4220521, term4220521.getClass(), "playerRating", 0);
        setIntField(term4220521, term4220521.getClass(), "highestRating", 0);
        setIntField(term4220521, term4220521.getClass(), "nameplateId", 0);
        setIntField(term4220521, term4220521.getClass(), "frameId", 0);
        setIntField(term4220521, term4220521.getClass(), "characterId", 0);
        setIntField(term4220521, term4220521.getClass(), "trophyId", 0);
        setIntField(term4220521, term4220521.getClass(), "playedTutorialBit", 0);
        setIntField(term4220521, term4220521.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term4220521, term4220521.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term4220521, term4220521.getClass(), "totalMapNum", 0);
        setLongField(term4220521, term4220521.getClass(), "totalHiScore", 0L);
        setLongField(term4220521, term4220521.getClass(), "totalBasicHighScore", 0L);
        setLongField(term4220521, term4220521.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term4220521, term4220521.getClass(), "totalExpertHighScore", 0L);
        setLongField(term4220521, term4220521.getClass(), "totalMasterHighScore", 0L);
        setLongField(term4220521, term4220521.getClass(), "totalUltimaHighScore", 0L);
        setField(term4220521, term4220521.getClass(), "eventWatchedDate", null);
        setIntField(term4220521, term4220521.getClass(), "friendCount", 0);
        setField(term4220521, term4220521.getClass(), "firstGameId", null);
        setField(term4220521, term4220521.getClass(), "firstRomVersion", null);
        setField(term4220521, term4220521.getClass(), "firstDataVersion", null);
        setField(term4220521, term4220521.getClass(), "firstPlayDate", null);
        setField(term4220521, term4220521.getClass(), "lastGameId", null);
        setField(term4220521, term4220521.getClass(), "lastRomVersion", null);
        setField(term4220521, term4220521.getClass(), "lastDataVersion", null);
        setField(term4220521, term4220521.getClass(), "lastLoginDate", null);
        setField(term4220521, term4220521.getClass(), "lastPlayDate", null);
        setIntField(term4220521, term4220521.getClass(), "lastPlaceId", 0);
        setField(term4220521, term4220521.getClass(), "lastPlaceName", null);
        setField(term4220521, term4220521.getClass(), "lastRegionId", null);
        setField(term4220521, term4220521.getClass(), "lastRegionName", null);
        setField(term4220521, term4220521.getClass(), "lastAllNetId", null);
        setField(term4220521, term4220521.getClass(), "lastClientId", null);
        setField(term4220521, term4220521.getClass(), "lastCountryCode", null);
        setField(term4220521, term4220521.getClass(), "userNameEx", null);
        setField(term4220521, term4220521.getClass(), "compatibleCmVersion", null);
        setIntField(term4220521, term4220521.getClass(), "medal", 0);
        setIntField(term4220521, term4220521.getClass(), "mapIconId", 0);
        setIntField(term4220521, term4220521.getClass(), "voiceId", 0);
        setIntField(term4220521, term4220521.getClass(), "avatarWear", 0);
        setIntField(term4220521, term4220521.getClass(), "avatarHead", 0);
        setIntField(term4220521, term4220521.getClass(), "avatarFace", 0);
        setIntField(term4220521, term4220521.getClass(), "avatarSkin", 0);
        setIntField(term4220521, term4220521.getClass(), "avatarItem", 0);
        setIntField(term4220521, term4220521.getClass(), "avatarFront", 0);
        setIntField(term4220521, term4220521.getClass(), "avatarBack", 0);
        setIntField(term4220521, term4220521.getClass(), "classEmblemBase", 0);
        setIntField(term4220521, term4220521.getClass(), "classEmblemMedal", 0);
        setIntField(term4220521, term4220521.getClass(), "stockedGridCount", 0);
        setIntField(term4220521, term4220521.getClass(), "exMapLoopCount", 0);
        setIntField(term4220521, term4220521.getClass(), "netBattlePlayCount", 0);
        setIntField(term4220521, term4220521.getClass(), "netBattleWinCount", 0);
        setIntField(term4220521, term4220521.getClass(), "netBattleLoseCount", 0);
        setIntField(term4220521, term4220521.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term4220521, term4220521.getClass(), "charaIllustId", 0);
        setIntField(term4220521, term4220521.getClass(), "skillId", 0);
        setIntField(term4220521, term4220521.getClass(), "overPowerPoint", 0);
        setIntField(term4220521, term4220521.getClass(), "overPowerRate", 0);
        setIntField(term4220521, term4220521.getClass(), "overPowerLowerRank", 0);
        setIntField(term4220521, term4220521.getClass(), "avatarPoint", 0);
        setIntField(term4220521, term4220521.getClass(), "battleRankId", 0);
        setIntField(term4220521, term4220521.getClass(), "battleRankPoint", 0);
        setIntField(term4220521, term4220521.getClass(), "eliteRankPoint", 0);
        setIntField(term4220521, term4220521.getClass(), "netBattle1stCount", 0);
        setIntField(term4220521, term4220521.getClass(), "netBattle2ndCount", 0);
        setIntField(term4220521, term4220521.getClass(), "netBattle3rdCount", 0);
        setIntField(term4220521, term4220521.getClass(), "netBattle4thCount", 0);
        setIntField(term4220521, term4220521.getClass(), "netBattleCorrection", 0);
        setIntField(term4220521, term4220521.getClass(), "netBattleErrCnt", 0);
        setIntField(term4220521, term4220521.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term4220521, term4220521.getClass(), "battleRewardStatus", 0);
        setIntField(term4220521, term4220521.getClass(), "battleRewardIndex", 0);
        setIntField(term4220521, term4220521.getClass(), "battleRewardCount", 0);
        setIntField(term4220521, term4220521.getClass(), "ext1", 0);
        setIntField(term4220521, term4220521.getClass(), "ext2", 0);
        setIntField(term4220521, term4220521.getClass(), "ext3", 0);
        setIntField(term4220521, term4220521.getClass(), "ext4", 0);
        setIntField(term4220521, term4220521.getClass(), "ext5", 0);
        setIntField(term4220521, term4220521.getClass(), "ext6", 0);
        setIntField(term4220521, term4220521.getClass(), "ext7", 0);
        setIntField(term4220521, term4220521.getClass(), "ext8", 0);
        setIntField(term4220521, term4220521.getClass(), "ext9", 0);
        setIntField(term4220521, term4220521.getClass(), "ext10", 0);
        setField(term4220521, term4220521.getClass(), "extStr1", null);
        setField(term4220521, term4220521.getClass(), "extStr2", null);
        setLongField(term4220521, term4220521.getClass(), "extLong1", 0L);
        setLongField(term4220521, term4220521.getClass(), "extLong2", 0L);
        setField(term4220521, term4220521.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term4220521, term4220521.getClass(), "isNetBattleHost", false);
        setIntField(term4220521, term4220521.getClass(), "netBattleEndState", 0);
        term4220598 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4220598;
        callMethod(klass, "setPlayerRating", argTypes, term4220521, args);
    }

};


