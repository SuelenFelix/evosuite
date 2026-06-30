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

public class UserData_setExtStr1_105344791399 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term292441;

    public UserData_setExtStr1_105344791399() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term292441 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term292441, term292441.getClass(), "id", 0L);
        setField(term292441, term292441.getClass(), "card", null);
        setField(term292441, term292441.getClass(), "userName", null);
        setIntField(term292441, term292441.getClass(), "level", 0);
        setIntField(term292441, term292441.getClass(), "reincarnationNum", 0);
        setField(term292441, term292441.getClass(), "exp", null);
        setLongField(term292441, term292441.getClass(), "point", 0L);
        setLongField(term292441, term292441.getClass(), "totalPoint", 0L);
        setIntField(term292441, term292441.getClass(), "playCount", 0);
        setIntField(term292441, term292441.getClass(), "multiPlayCount", 0);
        setIntField(term292441, term292441.getClass(), "playerRating", 0);
        setIntField(term292441, term292441.getClass(), "highestRating", 0);
        setIntField(term292441, term292441.getClass(), "nameplateId", 0);
        setIntField(term292441, term292441.getClass(), "frameId", 0);
        setIntField(term292441, term292441.getClass(), "characterId", 0);
        setIntField(term292441, term292441.getClass(), "trophyId", 0);
        setIntField(term292441, term292441.getClass(), "playedTutorialBit", 0);
        setIntField(term292441, term292441.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term292441, term292441.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term292441, term292441.getClass(), "totalMapNum", 0);
        setLongField(term292441, term292441.getClass(), "totalHiScore", 0L);
        setLongField(term292441, term292441.getClass(), "totalBasicHighScore", 0L);
        setLongField(term292441, term292441.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term292441, term292441.getClass(), "totalExpertHighScore", 0L);
        setLongField(term292441, term292441.getClass(), "totalMasterHighScore", 0L);
        setLongField(term292441, term292441.getClass(), "totalUltimaHighScore", 0L);
        setField(term292441, term292441.getClass(), "eventWatchedDate", null);
        setIntField(term292441, term292441.getClass(), "friendCount", 0);
        setField(term292441, term292441.getClass(), "firstGameId", null);
        setField(term292441, term292441.getClass(), "firstRomVersion", null);
        setField(term292441, term292441.getClass(), "firstDataVersion", null);
        setField(term292441, term292441.getClass(), "firstPlayDate", null);
        setField(term292441, term292441.getClass(), "lastGameId", null);
        setField(term292441, term292441.getClass(), "lastRomVersion", null);
        setField(term292441, term292441.getClass(), "lastDataVersion", null);
        setField(term292441, term292441.getClass(), "lastLoginDate", null);
        setField(term292441, term292441.getClass(), "lastPlayDate", null);
        setIntField(term292441, term292441.getClass(), "lastPlaceId", 0);
        setField(term292441, term292441.getClass(), "lastPlaceName", null);
        setField(term292441, term292441.getClass(), "lastRegionId", null);
        setField(term292441, term292441.getClass(), "lastRegionName", null);
        setField(term292441, term292441.getClass(), "lastAllNetId", null);
        setField(term292441, term292441.getClass(), "lastClientId", null);
        setField(term292441, term292441.getClass(), "lastCountryCode", null);
        setField(term292441, term292441.getClass(), "userNameEx", null);
        setField(term292441, term292441.getClass(), "compatibleCmVersion", null);
        setIntField(term292441, term292441.getClass(), "medal", 0);
        setIntField(term292441, term292441.getClass(), "mapIconId", 0);
        setIntField(term292441, term292441.getClass(), "voiceId", 0);
        setIntField(term292441, term292441.getClass(), "avatarWear", 0);
        setIntField(term292441, term292441.getClass(), "avatarHead", 0);
        setIntField(term292441, term292441.getClass(), "avatarFace", 0);
        setIntField(term292441, term292441.getClass(), "avatarSkin", 0);
        setIntField(term292441, term292441.getClass(), "avatarItem", 0);
        setIntField(term292441, term292441.getClass(), "avatarFront", 0);
        setIntField(term292441, term292441.getClass(), "avatarBack", 0);
        setIntField(term292441, term292441.getClass(), "classEmblemBase", 0);
        setIntField(term292441, term292441.getClass(), "classEmblemMedal", 0);
        setIntField(term292441, term292441.getClass(), "stockedGridCount", 0);
        setIntField(term292441, term292441.getClass(), "exMapLoopCount", 0);
        setIntField(term292441, term292441.getClass(), "netBattlePlayCount", 0);
        setIntField(term292441, term292441.getClass(), "netBattleWinCount", 0);
        setIntField(term292441, term292441.getClass(), "netBattleLoseCount", 0);
        setIntField(term292441, term292441.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term292441, term292441.getClass(), "charaIllustId", 0);
        setIntField(term292441, term292441.getClass(), "skillId", 0);
        setIntField(term292441, term292441.getClass(), "overPowerPoint", 0);
        setIntField(term292441, term292441.getClass(), "overPowerRate", 0);
        setIntField(term292441, term292441.getClass(), "overPowerLowerRank", 0);
        setIntField(term292441, term292441.getClass(), "avatarPoint", 0);
        setIntField(term292441, term292441.getClass(), "battleRankId", 0);
        setIntField(term292441, term292441.getClass(), "battleRankPoint", 0);
        setIntField(term292441, term292441.getClass(), "eliteRankPoint", 0);
        setIntField(term292441, term292441.getClass(), "netBattle1stCount", 0);
        setIntField(term292441, term292441.getClass(), "netBattle2ndCount", 0);
        setIntField(term292441, term292441.getClass(), "netBattle3rdCount", 0);
        setIntField(term292441, term292441.getClass(), "netBattle4thCount", 0);
        setIntField(term292441, term292441.getClass(), "netBattleCorrection", 0);
        setIntField(term292441, term292441.getClass(), "netBattleErrCnt", 0);
        setIntField(term292441, term292441.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term292441, term292441.getClass(), "battleRewardStatus", 0);
        setIntField(term292441, term292441.getClass(), "battleRewardIndex", 0);
        setIntField(term292441, term292441.getClass(), "battleRewardCount", 0);
        setIntField(term292441, term292441.getClass(), "ext1", 0);
        setIntField(term292441, term292441.getClass(), "ext2", 0);
        setIntField(term292441, term292441.getClass(), "ext3", 0);
        setIntField(term292441, term292441.getClass(), "ext4", 0);
        setIntField(term292441, term292441.getClass(), "ext5", 0);
        setIntField(term292441, term292441.getClass(), "ext6", 0);
        setIntField(term292441, term292441.getClass(), "ext7", 0);
        setIntField(term292441, term292441.getClass(), "ext8", 0);
        setIntField(term292441, term292441.getClass(), "ext9", 0);
        setIntField(term292441, term292441.getClass(), "ext10", 0);
        setField(term292441, term292441.getClass(), "extStr1", null);
        setField(term292441, term292441.getClass(), "extStr2", null);
        setLongField(term292441, term292441.getClass(), "extLong1", 0L);
        setLongField(term292441, term292441.getClass(), "extLong2", 0L);
        setField(term292441, term292441.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term292441, term292441.getClass(), "isNetBattleHost", false);
        setIntField(term292441, term292441.getClass(), "netBattleEndState", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setExtStr1", argTypes, term292441, args);
    }

};


